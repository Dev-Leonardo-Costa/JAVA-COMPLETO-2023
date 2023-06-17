package demo_dao_jdbc.model.impl;

import demo_dao_jdbc.db.DB;
import demo_dao_jdbc.model.dao.SellerDao;
import demo_dao_jdbc.model.entities.Department;
import demo_dao_jdbc.model.entities.Seller;
import projeto_com_jdbc.db.exceptions.DbException;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SellerDaoJDBC implements SellerDao {

    private Connection connection;

    public SellerDaoJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insert(Seller obj) {

        PreparedStatement statement = null;
        ResultSet rs = null;

        try {

            StringBuilder sb = new StringBuilder()
                    .append("insert into seller(Name, Email, BirthDate, BaseSalary , DepartmentId) ")
                    .append("values (?, ?, ?, ?, ?)");
            statement = connection.prepareStatement(sb.toString(), Statement.RETURN_GENERATED_KEYS);

            statement.setString(1, obj.getName());
            statement.setString(2, obj.getEmail());
            statement.setDate(3, new Date(obj.getBirthDate().getTime()));
            statement.setDouble(4, obj.getBaseSalary());
            statement.setInt(5, obj.getDepartment().getId());

            int rowsEffected = statement.executeUpdate();

            if (rowsEffected > 0) {

                rs = statement.getGeneratedKeys();

                if (rs.next()) {
                    int id = rs.getInt(1);
                    obj.setId(id);
                }

            } else {
                throw new DbException("Unexcepected error! No rows affected!");
            }

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
        }

    }

    @Override
    public void update(Seller obj) {
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {

            StringBuilder sb = new StringBuilder()
                    .append("UPDATE seller ")
                    .append("SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? ")
                    .append("WHERE Id = ?");
            statement = connection.prepareStatement(sb.toString());

            statement.setString(1, obj.getName());
            statement.setString(2, obj.getEmail());
            statement.setDate(3, new Date(obj.getBirthDate().getTime()));
            statement.setDouble(4, obj.getBaseSalary());
            statement.setInt(5, obj.getDepartment().getId());
            statement.setInt(6, obj.getId());

            statement.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
        }
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("DELETE FROM seller WHERE Id = ?");

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
        }

    }

    @Override
    public Seller findById(Integer id) {

        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {

            StringBuilder sb = new StringBuilder()
                    .append("select seller.*, department.Name as DepName ")
                    .append("from seller inner join department ")
                    .append("on seller.DepartmentId = Department.Id ")
                    .append("where seller.Id = ?");
            statement = connection.prepareStatement(sb.toString());

            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {

                Department department = instantiateDepartment(resultSet);
                Seller obj = instantiateSeller(resultSet, department);

                return obj;
            }

            return null;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }

    }

    @Override
    public List<Seller> findAll() {
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {

            StringBuilder sb = new StringBuilder()
                    .append("select seller.*, department.Name as DepName ")
                    .append("from seller inner join department ")
                    .append("on seller.DepartmentId = department.Id ")
                    .append("Order By Name");
            statement = connection.prepareStatement(sb.toString());

            resultSet = statement.executeQuery();

            List<Seller> sellerList = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (resultSet.next()) {

                Department dep = map.get(resultSet.getInt("DepartmentId"));

                if (dep == null) {
                    dep = instantiateDepartment(resultSet);
                    map.put(resultSet.getInt("DepartmentId"), dep);
                }

                Seller obj = instantiateSeller(resultSet, dep);
                sellerList.add(obj);

            }

            return sellerList;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }
    }

    @Override
    public List<Seller> findByDepartment(Department department) {
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {

            StringBuilder sb = new StringBuilder()
                    .append("select seller.*, department.Name as DepName ")
                    .append("from seller inner join department ")
                    .append("on seller.DepartmentId = department.Id ")
                    .append("where DepartmentId = ? ")
                    .append("Order By Name");
            statement = connection.prepareStatement(sb.toString());

            statement.setInt(1, department.getId());
            resultSet = statement.executeQuery();

            List<Seller> sellerList = new ArrayList<>();
            Map<Integer, Department> map = new HashMap<>();

            while (resultSet.next()) {

                Department dep = map.get(resultSet.getInt("DepartmentId"));

                if (dep == null) {
                    dep = instantiateDepartment(resultSet);
                    map.put(resultSet.getInt("DepartmentId"), dep);
                }

                Seller obj = instantiateSeller(resultSet, department);
                sellerList.add(obj);

            }

            return sellerList;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(resultSet);
        }
    }

    private static Department instantiateDepartment(ResultSet resultSet) throws SQLException {
        Department department = new Department();
        department.setId(resultSet.getInt("DepartmentId"));
        department.setName(resultSet.getString("DepName"));
        return department;
    }

    private static Seller instantiateSeller(ResultSet resultSet, Department department) throws SQLException {
        Seller obj = new Seller();
        obj.setId(resultSet.getInt("Id"));
        obj.setName(resultSet.getString("Name"));
        obj.setEmail(resultSet.getString("Email"));
        obj.setBirthDate(resultSet.getDate("BirthDate"));
        obj.setBaseSalary(resultSet.getDouble("BaseSalary"));
        obj.setDepartment(department);
        return obj;
    }
}

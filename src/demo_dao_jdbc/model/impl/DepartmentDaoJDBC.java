package demo_dao_jdbc.model.impl;

import demo_dao_jdbc.db.DB;
import demo_dao_jdbc.model.dao.DepartmentDao;
import demo_dao_jdbc.model.entities.Department;
import projeto_com_jdbc.db.exceptions.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



public class DepartmentDaoJDBC implements DepartmentDao {

    private Connection connection;

    public DepartmentDaoJDBC(Connection connection) {
        this.connection = connection;
    }


    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {

        PreparedStatement statement = null;
        ResultSet set = null;

        try {

            statement = connection.prepareStatement("select * from department where id = ?");
            statement.setInt(1, id);
            set = statement.executeQuery();

            if (set.next()) {
                Department department = instantiateDepartment(set);
                return department;
            }

            return null;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeResultSet(set);
        }

    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    private static Department instantiateDepartment(ResultSet resultSet) throws SQLException {
        Department department = new Department();
        department.setId(resultSet.getInt("DepartmentId"));
        department.setName(resultSet.getString("DepName"));
        return department;
    }
}

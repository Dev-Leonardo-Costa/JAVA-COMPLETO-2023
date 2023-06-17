package projeto_com_jdbc.db;

import projeto_com_jdbc.db.exceptions.DbException;
import projeto_com_jdbc.db.exceptions.DbIntegrityException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transation {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        Statement statement = null;

        try {

            connection = DB.getConnection();

            connection.setAutoCommit(false);

            statement = connection.createStatement();


            int rows1 = statement.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 1");

//            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Fake exception!");
//            }

            int rows2 = statement.executeUpdate("UPDATE seller SET BaseSalary = 6000 WHERE DepartmentId = 2");

            connection.commit();
            System.out.println("Done! rows effected: " + rows1);
            System.out.println("Done! rows effected: " + rows2);

        } catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbIntegrityException("Transaction roller back Cause by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Erro tring to rollback! Cause by: " + ex.getMessage());
            }
        } finally {
            DB.closeStatement(statement);
            DB.closeConnect();
        }
    }

}

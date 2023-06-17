package projeto_com_jdbc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DB.getConnection();

            StringBuilder data = new StringBuilder()
                    .append("UPDATE seller ")
                    .append("SET BaseSalary = BaseSalary + ? ")
                    .append("WHERE ")
                    .append("(DepartmentId = ?)");
            statement = connection.prepareStatement(data.toString());
            statement.setDouble(1, 200.0);
            statement.setInt(2, 2);

            int rowsEffected = statement.executeUpdate();

            System.out.println("Done! rows effected: " + rowsEffected);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(statement);
            DB.closeConnect();
        }
    }
}

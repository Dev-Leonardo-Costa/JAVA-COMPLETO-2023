package projeto_com_jdbc.db;

import projeto_com_jdbc.db.exceptions.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = DB.getConnection();

            StringBuilder data = new StringBuilder()
                    .append("DELETE FROM Department ")
                    .append("WHERE ")
                    .append("Id = ?");
            statement = connection.prepareStatement(data.toString());
            statement.setInt(1, 2);

            int rowsEffected = statement.executeUpdate();

            System.out.println("Done! rows effected: " + rowsEffected);
        } catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        } finally {
            DB.closeStatement(statement);
            DB.closeConnect();
        }
    }

}

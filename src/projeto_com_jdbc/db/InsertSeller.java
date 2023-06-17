package projeto_com_jdbc.db;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InsertSeller {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement st = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            connection = DB.getConnection();

            StringBuilder data = new StringBuilder()
                    .append("INSERT INTO seller ")
                    .append("(Name, Email, BirthDate, BaseSalary, DepartmentId) ")
                    .append("VALUES ")
                    .append("(?, ?, ?, ?, ?)");
            st = connection.prepareStatement(data.toString());

            st.setString(1, "Leonardo Costa");
            st.setString(2, "leo@gmail.com");
            st.setDate(3, new Date(sdf.parse("12/05/2023").getTime()));
            st.setDouble(4, 3000.0);
            st.setInt(5, 4);

            int rows = st.executeUpdate();

            System.out.println("Done! linhas afetadas: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            DB.closeStatement(st);
            DB.closeConnect();
        }

    }

}

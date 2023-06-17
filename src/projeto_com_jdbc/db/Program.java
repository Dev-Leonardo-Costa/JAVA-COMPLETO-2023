package projeto_com_jdbc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) {

        Connection connection = null;

        Statement st = null;
        ResultSet rs = null;

        try {

            connection = DB.getConnection();
            st = connection.createStatement();

            rs = st.executeQuery("Select * from department");

            while (rs.next()) {
                StringBuilder sb = new StringBuilder()
                        .append("Id: ")
                        .append(rs.getInt("id")).append(", ")
                        .append("Name: ")
                        .append(rs.getString("name"));
                sb.toString();

                System.out.println(sb);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnect();

        }

    }
}

package co.edu.sena.project4.util;

import java.sql.*;

public class UseBasicConnectionSingleton {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = BasicConnectionSingleton.getInstance(); Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM MyApp.users_tbl")) {
 while (rs.next()) {

            System.out.print(rs.getString("user_name")
            );
            System.out.print(" | ");

            System.out.println(rs.getString("user_lastname"));
        }
    } // end try
}
} // UseBasicConnectionSingleton

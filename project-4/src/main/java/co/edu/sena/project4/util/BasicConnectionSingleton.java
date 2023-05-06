package co.edu.sena.project4.util;

import java.sql.*;

public class BasicConnectionSingleton {
    private static String url =
            "jdbc:mysql://LocalHost:3306/MyApp?serverTimezone=America/Bogota";
    private static String user = "Myapp";
    private static String pass = "EpA123456-*";
    private static Connection conn;
    public static Connection getInstance()
            throws SQLException {
        if (conn == null) {
            conn =
                    DriverManager.getConnection(url, user,
                            pass);
        }
        return conn;
    }
} // BasicConnectionSingleton

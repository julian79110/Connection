package co.edu.sena.project4.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class ConnectionPool {
    private static final String URL =
            "jdbc:mysql://LocalHost:3306/MyApp?severTimezone=America/Bogota";
    private static final String USER = "Myapp";
    private static final String PASS = "EpA123456-*";
    private static BasicDataSource pool;
    public static BasicDataSource getInstance() throws SQLException{
        if (pool == null){
            pool=new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASS);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    } //getConnectionToDatabase
    public static Connection getConnection() throws SQLException{
        return getInstance().getConnection();
    }
}

package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() {

        Connection connection = null;


        try {
            String dbLogin = "root";
            String dbPassword = "root";
            String dbURL = "jdbc:mysql://localhost:3306/users";
            connection = DriverManager.getConnection(dbURL, dbLogin, dbPassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }
}

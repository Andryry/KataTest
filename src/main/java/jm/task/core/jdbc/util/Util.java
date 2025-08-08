package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    final static String URL = "jdbc:mysql://localhost:3306/KataAcademy";
    final static String USER = "1";
    final static String PWD = "p";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PWD);
    }

}

package com.mycompany.locadoradecarros.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionBanco {

    private static String url = "jdbc:mysql://localhost:3306/diagweb";
    private static String usuario = "root";
    private static String senha = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
}

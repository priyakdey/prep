package com.priyakdey.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Priyak Dey
 */
public class DatabaseConnection {

    private static volatile DatabaseConnection instance = null;

    private volatile Connection conn;

    private DatabaseConnection() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create objects.");
        }
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }

        return instance;
    }

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        if (conn == null) {
            synchronized (this) {
                if (conn == null) {
                    final var url = "jdbc:postgresql://localhost:5432/admin";   // I have a docker instance running
                    final var username = "admin";
                    final var password = "password";

                    Class.forName("org.postgresql.Driver");
                    conn = DriverManager.getConnection(url, username, password);
                }
            }
        }

        return conn;
    }

    public void close() throws SQLException {
        if (conn != null) {
            synchronized (this) {
                if (conn != null) {
                    conn.close();
                }
            }
        }
    }
}

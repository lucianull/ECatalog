package SQLDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbContext {

    private static DbContext instance = null;
    private Connection context;

    private DbContext() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Unable to load MySQL JDBC driver");
            e.printStackTrace();
        }
    }

    static public DbContext getInstance() {
        if (instance == null) {
            instance = new DbContext();
        }
        return instance;
    }

    public void connect(String url, String username, String password, String schema) {
        try {
            // Connect to the MySQL database using the provided URL, username, and password
            context = DriverManager.getConnection(url + "/" + schema, username, password);
            System.out.println("Connected to database");
        } catch (SQLException e) {
            System.err.println("Error: Unable to connect to database");
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (context != null) {
                context.close();
                System.out.println("Disconnected from database");
            }
        } catch (SQLException e) {
            System.err.println("Error: Unable to disconnect from database");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return context;
    }
}

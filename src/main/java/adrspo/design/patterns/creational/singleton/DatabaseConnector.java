package adrspo.design.patterns.creational.singleton;

import java.util.LinkedHashMap;
import java.util.List;

public class DatabaseConnector {

    private String dbDriver;
    private String dbUrl;
    private String username;
    private String password;

    private volatile static DatabaseConnector DB_CONNECTOR;

    private DatabaseConnector() {
        dbDriver = "com.mysql.jdbc.Driver";
        dbUrl = "jdbc:mysql://localhost:3306/database";
        username = "username";
        password = "password";
    }

    public static DatabaseConnector getInstance() {
        if (DB_CONNECTOR == null)
            synchronized (DatabaseConnector.class) {
                if (DB_CONNECTOR == null)
                    DB_CONNECTOR = new DatabaseConnector();
            }

        return DB_CONNECTOR;

    }

    public void connect() {
        System.out.println("Connecting to database...");
    }

    public void disconnect() {
        System.out.println("Closing connection with database");
    }

    public LinkedHashMap<String, List<String>> executeQuery(String query) {
        LinkedHashMap<String, List<String>> queryResults = new LinkedHashMap<>();

        System.out.println("Fetching a result to queryResults object");

        return queryResults;

    }

    public String getDbDriver() {
        return dbDriver;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}

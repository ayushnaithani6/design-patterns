package src.main.java.com.creational.factory.managers;

import src.main.java.com.creational.factory.databaseConnections.DatabaseConnection;
import src.main.java.com.creational.factory.databaseConnections.MySQLConnection;
import src.main.java.com.creational.factory.databaseConnections.PostgreSQLConnection;

public class DynamicDBConnectionManager {
    public DatabaseConnection getConnection(String databaseName) {
        if (databaseName.equals("MYSQL")) {
            return new MySQLConnection();
        } else if(databaseName.equals("POSTGRESQL")) {
            return new PostgreSQLConnection();
        } else {
            return null;
        }
    }
}
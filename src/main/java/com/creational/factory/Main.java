package src.main.java.com.creational.factory;

import src.main.java.com.creational.factory.databaseConnections.DatabaseConnection;
import src.main.java.com.creational.factory.managers.DynamicDBConnectionManager;

public class Main {
    private static final DynamicDBConnectionManager dynamicDBConnectionManager = new DynamicDBConnectionManager();

    public static void main(String[] args) {
        DatabaseConnection databaseConnection1 = dynamicDBConnectionManager.getConnection("MYSQL");
        if(databaseConnection1 != null) {
            databaseConnection1.connect();
            databaseConnection1.disconnect();
        }

        DatabaseConnection databaseConnection2 = dynamicDBConnectionManager.getConnection("POSTGRESQL");
        if(databaseConnection2 != null) {
            databaseConnection2.connect();
            databaseConnection2.disconnect();
        }
    }
}
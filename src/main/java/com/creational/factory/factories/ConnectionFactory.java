package src.main.java.com.creational.factory.factories;

import src.main.java.com.creational.factory.databaseConnections.DatabaseConnection;

public interface ConnectionFactory {
    DatabaseConnection createConnection();
    void validateConnection();
}

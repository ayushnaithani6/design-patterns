package src.main.java.com.creational.factory.factories;

import src.main.java.com.creational.factory.databaseConnections.DatabaseConnection;
import src.main.java.com.creational.factory.databaseConnections.MySQLConnection;

public class MySQLConnectionFactory implements ConnectionFactory {
    @Override
    public DatabaseConnection createConnection() {
        return new MySQLConnection();
    }
}

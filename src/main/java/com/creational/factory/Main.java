package src.main.java.com.creational.factory;

import src.main.java.com.creational.factory.databaseConnections.DatabaseConnection;
import src.main.java.com.creational.factory.factories.ConnectionFactory;
import src.main.java.com.creational.factory.factories.MySQLConnectionFactory;
import src.main.java.com.creational.factory.factories.PostgreSQLConnectionFactory;

public class Main {

    public static void main(String[] args) {

        DatabaseConnection databaseConnection1 = getConnection(new MySQLConnectionFactory());
        databaseConnection1.connect();
        databaseConnection1.disconnect();

        DatabaseConnection databaseConnection2 = getConnection(new PostgreSQLConnectionFactory());
        databaseConnection2.connect();
        databaseConnection2.disconnect();
    }

    // Connection Factory will take care of any Sub class implemeting that Connection Factory
    private static DatabaseConnection getConnection(ConnectionFactory connectionFactory) {
        connectionFactory.validateConnection();
        return connectionFactory.createConnection();
    }
}
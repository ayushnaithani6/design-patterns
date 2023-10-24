package src.main.java.com.solidprinciples.interfacesegregation.badpath;

public class Main {
    public static void main(String[] args) {
        // We have User and Order extending Entity
        // and 2 Persistence service for which are implementing same interface

        // In Order Persistence service findByName is empty which is violation of ISP.
    }
}

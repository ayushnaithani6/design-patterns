package src.main.java.com.solidprinciples.interfacesegregation.happypath;

public class Main {
    public static void main(String[] args) {
        // We have User and Order extending Entity
        // and 2 Persistence service for which are implementing same interface

        // In badpath
        // In Order Persistence service findByName is empty which is violation of ISP.


        // Solution: Remove methods from interface that are uncommon and specific to base class
        // Keep findByName only specific to in UserPersistence.
        // Now interface is clean and base classes are also not containing redundant unimplemented methods.
    }
}

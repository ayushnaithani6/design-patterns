package src.main.java.com.solidprinciples.liskovsubstitution.happypath;

import src.main.java.com.solidprinciples.liskovsubstitution.happypath.Rectangle;

public class Main {
    // best way to solve the problem in badpath example is to remove the inheritance relationship
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(2);
        // same interface with common method compute Area
        // other than that they have nothing in common

        System.out.println(rectangle.computeArea());
        System.out.println(square.computeArea());
    }

}

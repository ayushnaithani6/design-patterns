package src.main.java.com.solidprinciples.liskovsubstitution.badpath;

public class Main {
    public static void main(String[] args) {
        // we can't do this
        Rectangle rectangle = new Square(2);

        rectangle.setHeight(3); // since object is of square both height and width will be set
        rectangle.setWidth(4);

        if(rectangle.getHeight() != 3) {
            System.out.println("height incorrect " + rectangle.getHeight());
        }
    }
}

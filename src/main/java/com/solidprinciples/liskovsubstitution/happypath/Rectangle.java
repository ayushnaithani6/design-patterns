package src.main.java.com.solidprinciples.liskovsubstitution.happypath;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int computeArea() {
        return height*width;
    }
}

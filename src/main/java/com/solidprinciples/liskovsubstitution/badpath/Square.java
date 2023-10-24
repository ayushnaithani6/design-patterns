package src.main.java.com.solidprinciples.liskovsubstitution.badpath;

public class Square extends Rectangle {
    private int side;

    public Square(int side) {
        super(side, side);
    }

    public int getSide() {
        return side;
    }

    @Override
    public void setHeight(int height) {
        setSide(height);
    }
    @Override
    public void setWidth(int width) {
        setSide(width);
    }

    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }
}

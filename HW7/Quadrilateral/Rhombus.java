package HW7.Quadrilateral;

public class Rhombus extends Quadrilateral {

    private double side;
    private double height;
    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * height;
    }
}

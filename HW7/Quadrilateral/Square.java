package HW7.Quadrilateral;

public class Square extends Quadrilateral{

    private double side;


    public Square(double side) {
        this.side = side;
    }


    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}

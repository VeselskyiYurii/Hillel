package HW7.Triangle;

public class EquilateralTriangle extends Triangle {

    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }


    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }
}

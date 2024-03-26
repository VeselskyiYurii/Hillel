package HW7.Quadrilateral;

public class Rectangle extends Quadrilateral {

    private double firstSide;
    private  double secondSide;

    public Rectangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.firstSide + this.secondSide);
    }

    @Override
    public double getArea() {
        return this.firstSide * this.secondSide;
    }
}

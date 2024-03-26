package HW7.Quadrilateral;

public class Trapezoid extends Quadrilateral{

    private double firstSide;
    private  double secondSide;
    private  double thirdSide;
    private double fourthSide;
    private double height;

    public Trapezoid(double firstSide, double secondSide, double thirdSide, double fourthSide, double height) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide = fourthSide;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return this.firstSide + this.secondSide+ this.thirdSide+ this.fourthSide;
    }

    @Override
    public double getArea() {
        return ((this.firstSide + this.secondSide) / 2) * height;
    }
}

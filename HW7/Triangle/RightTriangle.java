package HW7.Triangle;

public class RightTriangle extends Triangle {

    private double firstSide;
    private  double secondSide;
    private  double thirdSide;
    private double hypotenuse;

    public RightTriangle(double firstSide, double secondSide, double hypotenuse) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hypotenuse = hypotenuse;

    }

    public double hypotenuse () {
        return Math.sqrt(Math.pow(this.firstSide, 2) + Math.pow(this.secondSide, 2));
    }

    @Override
    public double getPerimeter() {
        return this.firstSide + this.secondSide + hypotenuse;
    }

    @Override
    public double getArea() {
        return 0.5 * this.firstSide * this.secondSide;
    }
}

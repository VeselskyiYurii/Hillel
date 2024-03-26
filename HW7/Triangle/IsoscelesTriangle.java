package HW7.Triangle;

public class IsoscelesTriangle extends Triangle {

    private double base;
    private double equalSides;

    public IsoscelesTriangle(double base, double equalSides) {
        this.base = base;
        this.equalSides = equalSides;
    }

    double halfBase = base / 2;
    double height = Math.sqrt(Math.pow(this.equalSides, 2) - Math.pow(halfBase, 2));



    @Override
    public double getPerimeter() {
        return  2 * this.base + this.equalSides;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

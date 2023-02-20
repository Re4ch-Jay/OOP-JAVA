package Week7Lab5.src.Ex03;

public class Circle extends Shape {
    private double raduis;
    private double pi = 3.14;

    public Circle() {
    }

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double getArea() {
        return this.pi * this.getRaduis() * this.getRaduis();
    }

    @Override
    public double getPerimeter() {
        return 2 * this.pi * getRaduis();
    }

}

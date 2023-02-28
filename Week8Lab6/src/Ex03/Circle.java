package Ex03;

public class Circle extends MyShape {
    private double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    public Circle() {
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    @Override
    public double getArea() {
        return 3.14 * raduis * raduis;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * raduis;
    }

}

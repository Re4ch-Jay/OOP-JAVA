package Week7Lab5.src.Ex03;

public class RightTriangle extends Shape {
    private double width, height;

    public RightTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double getHypothenuse() {
        return Math.pow(Math.pow(this.getWidth(), 2.0) + Math.pow(this.getHeight(), 2), 0.5);
    }

    @Override
    public double getArea() {
        return 0.5 * this.getHeight() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return this.getHeight() + this.getWidth() + this.getHypothenuse();
    }

}

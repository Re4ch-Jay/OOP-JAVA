package Week7Lab5.src.Ex03;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
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

    @Override
    public double getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * this.getHeight() + 2 * this.getWidth();
    }

}

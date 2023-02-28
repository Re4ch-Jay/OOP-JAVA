package Ex03;

public class RightTriangle extends MyShape {

    private double width, height;

    public RightTriangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RightTriangle() {
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
        return (width * height) / 2;
    }

    @Override
    public double getPerimeter() {
        double c = Math.sqrt(height * height + width * width);
        return height + width + c;
    }

}

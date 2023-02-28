package Ex03;

public abstract class MyShape {

    abstract public double getArea();

    abstract public double getPerimeter();

    public void setWidth(double nextDouble) {
    }

    public void setHeight(double nextDouble) {
    }

    public void setRaduis(double nextDouble) {
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + " Perimeter: " + getPerimeter();
    }
}

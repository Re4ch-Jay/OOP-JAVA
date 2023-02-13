public class Ex04Rectangle {
    private double width, height;
    private String color;

    public Ex04Rectangle() {

    }

    public Ex04Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Ex04Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return height * height;
    }
}

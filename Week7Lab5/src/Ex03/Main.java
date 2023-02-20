package Week7Lab5.src.Ex03;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(10, 20);

        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        RightTriangle rightTriangle = new RightTriangle(40, 40);

        System.out.println("Area of right triangle: " + rightTriangle.getArea());
        System.out.println("Perimeter of right  triangle: " + rightTriangle.getPerimeter());

    }
}

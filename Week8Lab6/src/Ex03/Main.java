package Ex03;

public class Main {
    public static void main(String[] args) {
        MyShape rectangle = new Rectangle(20, 20);

        MyShape rightTriangle = new RightTriangle(20, 20);

        MyShape circle = new Circle(20);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        System.out.println("Right Triangle area: " + rightTriangle.getArea());
        System.out.println("Right Triangle perimeter: " + rightTriangle.getPerimeter());

        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

    }
}

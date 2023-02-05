public class Ex04Main {
    public static void main(String[] args) {
        Ex04Rectangle rectangle1 = new Ex04Rectangle(20, 30, "Red");

        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Color: " + rectangle1.getColor());
        System.out.println("Area: " + rectangle1.getArea());

        System.out.println();

        Ex04Rectangle rectangle2 = new Ex04Rectangle(20, 30);

        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
    }
}

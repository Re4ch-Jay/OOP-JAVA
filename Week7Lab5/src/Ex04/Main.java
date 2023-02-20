package Week7Lab5.src.Ex04;

import java.util.Scanner;

import Week7Lab5.src.Ex03.Circle;
import Week7Lab5.src.Ex03.Rectangle;
import Week7Lab5.src.Ex03.RightTriangle;
import Week7Lab5.src.Ex03.Shape;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle(20);
        shapes[1] = new Rectangle(20, 20);
        shapes[2] = new RightTriangle(20, 20);
        shapes[3] = new Rectangle(40, 40);
        shapes[4] = new Circle(20);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }

    }
}

package Ex04;

import java.util.Scanner;

import Ex03.Circle;
import Ex03.MyShape;
import Ex03.Rectangle;
import Ex03.RightTriangle;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int currentIndex = 0;
    static MyShape[] myShape = new MyShape[20];

    public static void main(String[] args) {

        int key = 40;

        do {

            System.out.println("1. Add rectangle");
            System.out.println("2. Add circle");
            System.out.println("3. Add right triangle");
            System.out.println("4. Search by area");
            System.out.println("5. Show all");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            key = scanner.nextInt();
            switch (key) {
                case 1:
                    addRectangle();
                    break;
                case 2:
                    addCirlce();
                    break;
                case 3:
                    addRightTriangle();
                    break;
                case 4:
                    System.out.println("Search by area: ");
                    double area = scanner.nextDouble();
                    int found = searchByArea(area);
                    if (found != -1) {
                        if (myShape[found] instanceof Rectangle) {
                            System.out.println("Rectangle class");
                        } else if (myShape[found] instanceof Circle) {
                            System.out.println("Circle class");
                        } else {
                            System.out.println("Right Triangle class");
                        }
                    }
                    break;
                case 5:
                    showAll();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Welcome");
                    break;
            }

        } while (key != 0);
    }

    public static void addRectangle() {
        if (currentIndex < 20) {
            myShape[currentIndex] = new Rectangle();
            System.out.print("Width: ");
            myShape[currentIndex].setWidth(scanner.nextDouble());
            System.out.print("Height: ");
            myShape[currentIndex].setHeight(scanner.nextDouble());
            currentIndex++;
        } else {
            System.out.println("Full array");
        }
    }

    public static void addCirlce() {
        if (currentIndex < 20) {
            myShape[currentIndex] = new Circle();
            System.out.print("Raduis: ");

            myShape[currentIndex].setRaduis(scanner.nextDouble());
            currentIndex++;
        } else {
            System.out.println("Full array");
        }
    }

    public static void addRightTriangle() {
        if (currentIndex < 20) {
            myShape[currentIndex] = new RightTriangle();
            System.out.print("Width: ");

            myShape[currentIndex].setWidth(scanner.nextDouble());
            System.out.print("Height: ");

            myShape[currentIndex].setHeight(scanner.nextDouble());
            currentIndex++;
        } else {
            System.out.println("Full array");
        }
    }

    static int searchByArea(double searchArea) {

        for (int i = 0; i < myShape.length; i++) {
            if (myShape[i].getArea() == searchArea) {
                return i;
            }
        }
        return -1;
    }

    public static void showAll() {
        if (currentIndex == 0) {
            System.out.println("Array is empty");
        } else {
            for (MyShape shape : myShape) {

                if (shape instanceof Rectangle) {
                    System.out.println("Area of rectangle");
                    System.out.println(shape.toString());
                }
            }

            for (MyShape shape : myShape) {

                if (shape instanceof Circle) {
                    System.out.println("Area of circle");

                    System.out.println(shape.toString());
                }
            }

            for (MyShape shape : myShape) {

                if (shape instanceof RightTriangle) {
                    System.out.println("Area of right triangle");

                    System.out.println(shape.toString());
                }
            }
        }
    }
}

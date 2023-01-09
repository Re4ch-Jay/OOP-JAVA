import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input raduis: ");
        double radius = scanner.nextDouble();

        double result = 3.14 * (radius * radius);

        System.out.println("The area of the circle is: " + result);
    }
}

// 10. White program to get input circle’s radius from the user and then calculate and print
// the area and perimeter to screen. 

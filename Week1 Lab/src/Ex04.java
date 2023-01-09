import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;
        System.out.println("Input meters: ");
        meters = scanner.nextDouble();

        double feet = meters * 3.2181;
        System.out.println("Meters: "+ meters + " to feets is: " + feet);

    }
}

// Write a program that reads a number in meters, converts it to feet, and displays the
// result. Hint: One foot is 0.305 meter 


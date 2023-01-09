import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter kilo: ");
        double kilo = scanner.nextDouble();

        double pound =  2.205 * kilo;

        System.out.println("Kilos: " + kilo + " = " + pound + "pounds");
    }
}

// 5. Write a program that converts kilograms into pounds. The program prompts the user
// to enter a number in kilograms, converts it to pounds, and displays the result. Hint:
// One pound is 0.454 kilograms. 

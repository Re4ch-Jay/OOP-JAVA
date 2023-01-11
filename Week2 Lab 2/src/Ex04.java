import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int a = scanner.nextInt();
        System.out.print("Number: ");
        int b = scanner.nextInt();
        System.out.print("Number: ");
        int c = scanner.nextInt();

        int temp = a > b ? a : b;
        int largest = c > temp ? c : temp;
        System.out.println("The largest number is: " + largest);

    }
}

// 4. Write a java program to get three integer numbers from the user by using
// the scanner
// and print the largest number to the console.

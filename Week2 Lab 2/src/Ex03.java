import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positve number");
        }

    }
}

// 3. Write a Java program to get a number from the user and print whether it is
// positive or
// negative.
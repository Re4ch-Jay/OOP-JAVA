import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
    }
}

// 9. Write a Java Program to create an array integer that has 5 elements. Get
// input from
// the user to store the value in the array one by one then loop to access array
// to display
// to screen.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        int length = name.length();

        System.out.println("Name is " + name);
        System.out.println("Length of characters are: " + length);

    }
}

// 1. Write a Java Program to get input from the user as String, then print the
// String and the number of characters of that string to the console.

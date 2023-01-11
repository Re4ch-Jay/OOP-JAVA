import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String String = scanner.nextLine();

        if (String.equals("Hello")) {
            System.out.println("String is " + String + " is equal to Hello");
        } else {
            System.out.println("It is not equal");
        }

    }
}

// 2. Write a Java Program to get 1 String from the user then compare if the
// string equals
// “Hello” ;
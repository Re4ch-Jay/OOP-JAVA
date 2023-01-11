import java.util.Scanner;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("The age cannot be less than 0");
        } else {
            System.out.println("Your age is " + age + " years old");
        }
    }
}

// 5. Write a java program to read input from the user about age. When the age
// is less than
// 0 print the message “The age cannot be less than 0”. Otherwise, print “your
// age is
// the_input_age years old”. For example: if you input the age 20 then it will
// print “your
// age is 20 years old”
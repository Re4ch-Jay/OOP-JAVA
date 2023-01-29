import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int numbers[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int random_number = 1 + (int) (100 * Math.random());
            numbers[i] = random_number;
        }

        printAll(numbers);
        System.out.println("Average: " + findAvg(numbers));
        System.out.println("Max" + findMax(numbers));

    }

    public static double findAvg(int numbers[]) {
        double average;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return average = sum / numbers.length;
    }

    public static int findMax(int numbers[]) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > max) {
                max = numbers[i];
            }
        return max;
    }

    public static void printAll(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

// 10. Write a Java Program to create an array integer that has 10 elements.
// Random
// numbers to store the value in the array one by one in the main method. then
// write the
// following function to use in the main:
// a. double findAvg(int numbers[]) :find the average value of the array .
// b. int findMax(int numbers[]) : find the maximum value from the array
// elements
// c. void printAll(int numbers[]): Display or display the average value of the
// array
// to the screen.

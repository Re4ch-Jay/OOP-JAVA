import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2D array size : ");

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        System.out.println("Enter array elements : ");

        int array[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.print("\nData you entered : \n");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}

// 12. White a Java Program to create 2 dimensions arrays of Integer which
// number row and
// number column input by the user. Random number to fill the value of all
// elements of
// the array then displayed on the screen.

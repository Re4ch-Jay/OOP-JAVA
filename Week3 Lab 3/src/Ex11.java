public class Ex11 {
    public static void main(String[] args) {

        int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println();
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

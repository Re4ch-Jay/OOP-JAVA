import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Score: ");
        int score = scanner.nextInt();

        if (score >= 95) {
            System.out.println("Grade A");
        } else if (score >= 80 && score <= 94) {
            System.out.println("Grade B");
        } else if (score >= 74 && score <= 79) {
            System.out.println("Grade C");
        } else if (score >= 60 && score <= 73) {
            System.out.println("Grade D");
        } else if (score >= 50 && score <= 59) {
            System.out.println("Grade E");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Grade F");
        } else {
            System.out.println("Score can not below 0");
        }
    }
}

// 6. White java program to tell the user to input score. Print the grade (A, B,
// C, D, F)
// based on the score:
// - 95 - 100 => A
// - 80 – 94 => B
// - 74 – 79 => C
// - 60 – 73 => D
// - 50 – 59 => E
// - 0 – 49 => F.
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Gender: (M or m, F or f)");
        String gender = scanner.nextLine();

        if (gender == "M" || gender == "m") {
            System.out.println("Hello Mr. " + name);
        } else if (gender == "F" || gender == "f") {
            System.out.println("Hello Ms. " + name);
        } else {
            System.out.println("Please input (F or f forfemale and m or M for Male)");
        }
    }
}

// 7. Write a Java program to get input about the name, gender (F or f for
// female and m or
// M for Male), status (single or married) then prints to screen based on gender
// and
// status, In case:
// - the gender is female and status is single then print “Hello Miss.
// the_input_name”
// - the gender is female and status is married then print “Hello Ms.
// the_input_name”
// - otherwise print “Hello Mr. the_input_name”.

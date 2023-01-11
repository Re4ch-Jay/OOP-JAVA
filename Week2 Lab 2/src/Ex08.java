import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Letter: ");
        String letter = scanner.nextLine();

        switch (letter) {
            case "a":
                System.out.println("A for apple");
                break;
            case "b":
                System.out.println("b for boy");
                break;
            case "c":
                System.out.println("c for cat");
                break;
            case "d":
                System.out.println("d for dog");
                break;
            case "e":
                System.out.println("e for eat");
                break;
            case "f":
                System.out.println("f for font");
                break;
            case "g":
                System.out.println("g for good");
                break;
            case "h":
                System.out.println("h for hot");
                break;
            case "i":
                System.out.println("i for ice");
                break;
            case "j":
                System.out.println("j for jack");
                break;
            case "k":
                System.out.println("k for kick");
                break;
            case "l":
                System.out.println("l for link");
                break;
            case "m":
                System.out.println("m for milk");
                break;
            case "n":
                System.out.println("n for number");
                break;
            case "o":
                System.out.println("o for oil");
                break;
            case "p":
                System.out.println("p for pink");
                break;
            case "q":
                System.out.println("q for queen");
                break;
            case "r":
                System.out.println("r for reach");
                break;
            case "s":
                System.out.println("s for sing");
                break;
            case "t":
                System.out.println("t for tame");
                break;
            case "u":
                System.out.println("u for unique");
                break;
            case "v":
                System.out.println("v for verticle");
                break;
            case "w":
                System.out.println("w for walk");
                break;
            case "x":
                System.out.println("x for xylophone");
                break;
            case "y":
                System.out.println("y for you");
                break;
            case "z":
                System.out.println("z for zebra");
                break;
            default:
                break;
        }

    }
}

// 8. write a java program to get input from the user as char (a,b,c… g). print
// “a for Apple”
// in case the user inputs character ‘a’ and print “b for a boy’ in case of user
// inputs
// character ‘b’ and so on. (Should be from a to z but the minimum is from a to
// k)
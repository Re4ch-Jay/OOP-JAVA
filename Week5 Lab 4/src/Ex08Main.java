import java.util.Scanner;

public class Ex08Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Weight: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        Ex08Dog dog1 = new Ex08Dog(name, weight);
        System.out.println();
        dog1.printInfo();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Name: ");
        String name2 = scanner.nextLine();
        System.out.println("Weight: ");
        double weight2 = scanner.nextDouble();
        scanner.nextLine();
        Ex08Dog dog2 = new Ex08Dog(name2, weight2);
        System.out.println();
        dog1.printInfo();

    }
}

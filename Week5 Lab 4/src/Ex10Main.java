import java.util.Scanner;

public class Ex10Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter brand name: ");
        String brand = scanner.nextLine();

        System.out.print("Enter model name: ");
        String model = scanner.nextLine();

        System.out.print("Enter RAM size: ");
        int RAMSize = scanner.nextInt();

        System.out.print("Enter HDD size: ");
        int HDDSize = scanner.nextInt();

        Ex10Computer computer1 = new Ex10Computer(brand, model, RAMSize, HDDSize);

        System.out.println();
        computer1.printInfo();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter brand name: ");
        String brand2 = scanner2.nextLine();
        Ex10Computer computer2 = new Ex10Computer(brand);
        System.out.println();
        computer2.printInfo();

    }
}

import java.util.Scanner;

public class Ex09Main {
    public static void main(String[] args) {
        Ex09Dog dog = new Ex09Dog();
        Scanner scanner = new Scanner(System.in);

        int SIZE = 5;
        String[] dog_name = new String[SIZE];
        double[] dog_weight = new double[SIZE];

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Name: ");
            dog_name[i] = scanner.nextLine();
            System.out.print("Weight: ");
            dog_weight[i] = scanner.nextDouble();
            scanner.nextLine();

        }

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Name: " + dog_name[i]);
            System.out.println("Weight: " + dog_weight[i]);
        }

    }
}

import java.util.Scanner;

public class Ex09Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int SIZE = 5;

        Ex09Dog[] dogs = new Ex09Dog[SIZE];

        for (int i = 0; i < dogs.length; i++) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Owner: ");
            String owner = scanner.nextLine();
            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            Ex09Dog dog = new Ex09Dog(name, weight, owner);
            dogs[i] = dog;
            System.out.println();
        }

        for (Ex09Dog dog : dogs) {
            System.out.println("Name: " + dog.getName());
            System.out.println("Weight: " + dog.getWeight());
            System.out.println("Owner: " + dog.getOwner());
        }

    }
}

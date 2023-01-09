import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fullname: ");
        String fullname = scanner.nextLine();
        
        System.out.print("Age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        
        System.out.print("Address: ");
        String address = scanner.nextLine();
        scanner.close();

        System.out.println("Fullname: " + fullname);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}


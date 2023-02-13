import java.util.Arrays;
import java.util.Scanner;

public class Ex07Main {
    public static void main(String[] args) {
        Ex07Student[] listStudents = new Ex07Student[10];

        fillData(listStudents);
        System.out.println();

        printAll(listStudents);
        System.out.println();

        searchStudentById(listStudents, "1");
        System.out.println();

        searchStudentByName(listStudents, "Jack");
        System.out.println();

        sortById(listStudents);
        System.out.println();
        sortByName(listStudents);
        System.out.println();

    }

    public static void fillData(Ex07Student[] listStudents) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listStudents.length; i++) {

            System.out.print("Enter id: ");
            String id = scanner.nextLine();

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter generation: ");
            int generation = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter department: ");
            String department = scanner.nextLine();

            Ex07Student student = new Ex07Student(id, name, generation, department);
            listStudents[i] = student;
        }

    }

    public static void printAll(Ex07Student[] listStudents) {
        System.out.println("List of students");

        for (int i = 0; i < listStudents.length; i++) {
            System.out.println("Id: " + listStudents[i].getId());
            System.out.println("Name: " + listStudents[i].getName());
            System.out.println("Generation: " + listStudents[i].getGeneration());
            System.out.println("Department: " + listStudents[i].getDepartment());
        }
    }

    public static void searchStudentByName(Ex07Student[] listStudents, String name) {
        System.out.println("Search student by name");
        for (int i = 0; i < listStudents.length; i++) {
            if (name.equals(listStudents[i].getName())) {
                System.out.println("ID: " + listStudents[i].getId());
                System.out.println("Name: " + listStudents[i].getName());
                System.out.println("Generation: " + listStudents[i].getGeneration());
                System.out.println("Department: " + listStudents[i].getDepartment());
            }
        }
    }

    public static void searchStudentById(Ex07Student[] listStudents, String id) {
        System.out.println("Search student by id");
        for (int i = 0; i < listStudents.length; i++) {
            if (id.equals(listStudents[i].getId())) {
                System.out.println("ID: " + listStudents[i].getId());
                System.out.println("Name: " + listStudents[i].getName());
                System.out.println("Generation: " + listStudents[i].getGeneration());
                System.out.println("Department: " + listStudents[i].getDepartment());
            }
        }
    }

    public static void sortById(Ex07Student[] listStudents) {

        System.out.println("Sort students by ID");

        System.out.println("Before sort");
        System.out.println(Arrays.asList(listStudents));
        Arrays.sort(listStudents, (a, b) -> a.getId().compareTo(b.getId()));
        System.out.println("After");
        System.out.println(Arrays.asList(listStudents));

    }

    public static void sortByName(Ex07Student[] listStudents) {

        System.out.println("Sort students by Name");
        System.out.println("Before sort");
        System.out.println(Arrays.asList(listStudents));
        Arrays.sort(listStudents, (a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("After");
        System.out.println(Arrays.asList(listStudents));

    }
}

package Ex02;

import java.util.Scanner;

import Ex01.Human;
import Ex01.Student;
import Ex01.Teacher;

public class Main {

    static Scanner scanner = new Scanner(System.in); // Capturing the input

    static Human[] humans = new Human[20];
    static int currentIndex = 0;

    public static void main(String[] args) {
        String choice = null;

        do {
            System.out.println("1. Add student");
            System.out.println("2. Add teachers");
            System.out.println("3. Search by name");
            System.out.println("4. Edit by name");
            System.out.println("5. Show all");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    addTeacher();
                    break;
                case "3":
                    System.out.println("Search by Name: ");
                    String name = scanner.nextLine();
                    int found = searchByname(name);
                    if (found == -1) {
                        System.out.println("Not found");
                    } else {
                        System.out.println("Found");
                        System.out.println(humans[found].toString());
                    }
                    break;
                case "4":
                    editByName();
                    break;
                case "5":
                    showAll();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Welcome to my program");
                    break;
            }

        } while (!choice.equals("0"));
    }

    static void addStudent() {
        if (currentIndex < 20) {

            humans[currentIndex] = new Student();
            System.out.print("Name: ");
            humans[currentIndex].setName(scanner.nextLine());
            System.out.print("ID: ");
            humans[currentIndex].setId(scanner.nextLine());
            System.out.print("Age: ");
            humans[currentIndex].setAge(scanner.nextInt());
            System.out.print("Nationality: ");
            scanner.nextLine();
            humans[currentIndex].setNationality(scanner.nextLine());
            System.out.print("Skills: ");
            humans[currentIndex].setSkills(scanner.nextLine());
            System.out.print("School: ");
            humans[currentIndex].setSchool(scanner.nextLine());
            currentIndex++;
        } else {
            System.out.println("Full in array");
        }
    }

    static void addTeacher() {
        if (currentIndex < 20) {
            humans[currentIndex] = new Teacher();
            System.out.print("Name: ");
            humans[currentIndex].setName(scanner.nextLine());
            System.out.print("ID: ");
            humans[currentIndex].setId(scanner.nextLine());
            System.out.print("Age: ");
            humans[currentIndex].setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Nationality: ");
            humans[currentIndex].setNationality(scanner.nextLine());
            System.out.print("School: ");
            humans[currentIndex].setSchool(scanner.nextLine());
            System.out.print("Salary: ");
            humans[currentIndex].setSalary(scanner.nextDouble());
            currentIndex++;
        } else {
            System.out.println("Full in array");
        }
    }

    static void showAll() {
        for (Human human : humans) {
            if (human instanceof Student) {
                System.out.println(human.toString());
            }
        }

        for (Human human : humans) {
            if (human instanceof Teacher) {
                System.out.println(human.toString());
            }
        }
    }

    static int searchByname(String name) {
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    static void editByName() {
        System.out.println("Search by name: ");
        String searchName = scanner.nextLine();
        int found = searchByname(searchName);
        if (found != -1) {
            if (humans[found] instanceof Student) {
                System.out.println("New name: ");
                humans[found].setName(scanner.nextLine());
                System.out.println("New age: ");
                humans[found].setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.println("New id: ");
                humans[found].setId(scanner.nextLine());
                System.out.println("New nationality: ");
                humans[found].setNationality(scanner.nextLine());
                System.out.println("New school: ");
                humans[found].setSchool(scanner.nextLine());
                System.out.println("New skills: ");
                humans[found].setSkills(scanner.nextLine());
            } else {
                System.out.println("New name: ");
                humans[found].setName(scanner.nextLine());
                System.out.println("New age: ");
                humans[found].setAge(scanner.nextInt());
                scanner.nextLine();
                System.out.println("New id: ");
                humans[found].setId(scanner.nextLine());
                System.out.println("New nationality: ");
                humans[found].setNationality(scanner.nextLine());
                System.out.println("New school: ");
                humans[found].setSchool(scanner.nextLine());
                System.out.println("New salary: ");
                humans[found].setSalary(scanner.nextDouble());
            }
        } else {
            System.out.println("Human not found");
        }

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String name, major, grade, choice;
        int age; 

        System.out.print("Input name: ");
        name = scanner.next();
        System.out.print("Input major: ");
        major = scanner.next();
        System.out.print("Input grade: ");
        grade = scanner.next();
        System.out.print("Input age: ");
        age = scanner.nextInt();

        Student student = new Student(name, major, grade, age);

        student.displayStudent(student);
    
        System.out.print("Input name: ");
        name = scanner.next();
        System.out.print("Input major: ");
        major = scanner.next();
        System.out.print("Input grade: ");
        grade = scanner.next();
        System.out.print("Input age: ");
        age = scanner.nextInt();

        student.setName(name);
        student.setMajor(major);
        student.setGrade(grade);
        student.setAge(age);

        student.displayStudent(student);
        
        double salary;
        System.out.print("Input name: ");
        name = scanner.next();
        System.out.print("Input major: ");
        major = scanner.next();
        System.out.print("Input grade: ");
        grade = scanner.next();
        System.out.print("Input age: ");
        age = scanner.nextInt();
        System.out.print("Input salary: ");
        salary = scanner.nextDouble();

        Teacher teacher = new Teacher(salary, name, major, grade, age);

        teacher.displayTeacher(teacher);

    }
}

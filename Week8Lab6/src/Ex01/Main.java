package Ex01;

public class Main {
    public static void main(String[] args) {
        Human student = new Student();
        Human teacher = new Student();

        System.out.println(student.getResponsible());
        System.out.println(teacher.getResponsible());

    }
}

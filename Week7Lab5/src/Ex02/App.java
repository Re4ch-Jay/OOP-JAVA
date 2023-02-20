public class App {
    public static void main(String[] args) {
        Human human = new Human("Reach", 19);

        System.out.println(human.getAge());
        System.out.println(human.getName());

        Student student = new Student("123", "CADT", "CS");

        System.out.println(student.getStudentId());
        System.out.println(student.getSchoolName());
        System.out.println(student.getSkill());

    }
}

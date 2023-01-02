public class Teacher extends Student {
    double salary;

    public Teacher(double salary, String name, String major, String grade, int age){
        super(name, major, grade, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void displayTeacher(Teacher teacher) {
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Major: " + teacher.getMajor());
        System.out.println("Grade: " + teacher.getGrade());
        System.out.println("Grade: " + teacher.getSalary());
    }
}

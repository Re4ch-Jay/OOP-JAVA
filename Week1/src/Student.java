import java.util.Scanner;

public class Student {
    String name, major, grade;
    int age;

    public Student(String name, String major, String grade, int age) {
        this.age = age;
        this.name = name;           
        this.major = major;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String getMajor() {
        return major;
    }
    public String getGrade() {
        return grade;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void displayStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " +student.getMajor());
        System.out.println("Grade: " +student.getGrade());
    }

    public void getAverageAge() {
        int sum = 0;
        sum += this.getAge();  
    }
}




package Ex01;

public class Teacher extends Human {

    private String school;

    public String getSchool() {
        return school;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Teacher(String name, String nationality, String id, int age, String school, double salary) {
        super(name, nationality, id, age);
        this.school = school;
        this.salary = salary;
    }

    public Teacher() {
    }

    @Override
    String getResponsible() {
        return "Teach";
    }

    @Override
    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nNationality: " + getNationality() + "\nSchool: "
                + getSchool() + "\nSalary: " + getSalary();
    }

}

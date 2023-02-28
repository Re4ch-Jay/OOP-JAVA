package Ex01;

public class Student extends Human {

    private String school, skills;

    public Student() {

    }

    public Student(String school, String skills) {
        this.school = school;
        this.skills = skills;
    }

    public Student(String name, String nationality, String id, int age, String school, String skills) {
        super(name, nationality, id, age);
        this.school = school;
        this.skills = skills;
    }

    @Override
    String getResponsible() {
        return "Study";
    }

    public int getAge() {
        return super.getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return super.getId();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationality() {
        return super.getNationality();
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nAge: " + getAge() + "\nNationality: " + getNationality() + "\nSchool: "
                + getSchool() + "\nSkill: " + getSkills();
    }
}

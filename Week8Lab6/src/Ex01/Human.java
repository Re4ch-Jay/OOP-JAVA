package Ex01;

public abstract class Human {
    protected String name;
    protected String nationality;
    protected String id;
    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human() {
    }

    public Human(String name, String nationality, String id, int age) {
        this.name = name;
        this.nationality = nationality;
        this.id = id;
        this.age = age;
    }

    public Human(String name, String nationality, String id) {
        this.name = name;
        this.nationality = nationality;
        this.id = id;
    }

    public Human(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public Human(String name) {
        this.name = name;
    }

    abstract String getResponsible();

    public void setSkills(String skills) {

    };

    public abstract void setSchool(String school);

    public void setSalary(double nextDouble) {
    }
}

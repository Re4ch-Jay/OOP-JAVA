public class Ex07Student {
    private String id, name, department;
    private int generation;

    public Ex07Student() {

    }

    public Ex07Student(String id) {
        this.id = id;
    }

    public Ex07Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Ex07Student(String id, String name, int generation) {
        this.id = id;
        this.name = name;
        this.generation = generation;
    }

    public Ex07Student(String id, String name, int generation, String department) {
        this.id = id;
        this.name = name;
        this.generation = generation;
        this.department = department;
    }

    @Override
    public String toString() {
        return ("(" + id + ", " + name + ", " + generation + ", " + department + ")");
    }

    public void setId(String id) {
        id = id;
    }

    public void setName(String name) {
        name = name;
    }

    public void setGeneration(int generation) {
        generation = generation;
    }

    public void setDepartment(String department) {
        department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGeneration() {
        return generation;
    }

    public String getDepartment() {
        return department;
    }

    public void printInfo() {
        System.out.println("Id: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Generation: " + this.getGeneration());
        System.out.println("Department: " + this.getDepartment());
    }
}

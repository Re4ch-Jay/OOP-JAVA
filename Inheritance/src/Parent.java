public class Parent {

    public String name = "Reach";
    public String job;
    public int age;

    public Parent() {
        this(20);
        System.out.println("I am Reach " + age + " years old");
    }

    public Parent(int age) {
        this("Software engineering");
        this.age = age;

        System.out.println();
    }

    public Parent(String job) {
        this.job = job;
    }
}

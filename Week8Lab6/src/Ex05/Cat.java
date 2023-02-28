package Ex05;

public class Cat extends Animal implements Pet {

    private String name;

    Cat(String name, int legs) {
        super(legs);
        System.out.println("Cat has " + legs + " legs");
        this.name = name;
    }

    Cat(String name) {
        this(name, 4);
    }

    Cat() {
        this("Cat", 4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(this.name + " is playing");
    }

    @Override
    void eat() {
        System.out.println(this.name + " is eating");
    }

}

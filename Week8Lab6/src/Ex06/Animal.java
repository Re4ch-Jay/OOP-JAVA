package Ex06;

public class Animal implements Walkable {
    protected int legs;
    private String name;

    Animal() {
        this.name = "Animal";
    }

    Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println(this.name + "Animal is walking with " + this.legs + " legs.");
    }

    @Override
    public void walkLeft() {
        System.out.println(this.name + "Animal walk to the left");

    }

    @Override
    public void walkRight() {
        System.out.println(this.name + "Animal walk to the right");
    }

    @Override
    public void walkForward() {
        System.out.println(this.name + "Animal walk to the front");
    }

    @Override
    public void walkBackward() {
        System.out.println(this.name + "Animal walk to the back");
    }

}

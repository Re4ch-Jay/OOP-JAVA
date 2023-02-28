package Ex06;

public class Human implements Walkable {
    private String name;
    private int legs;

    public Human() {
        this.name = "Human";
        this.legs = 2;
    }

    public Human(String name) {
        this.name = name;
        this.legs = 2;
    }

    public void walk() {
        System.out.println(this.name + " is walking with " + this.legs + " legs.");
    }

    @Override
    public void walkLeft() {
        System.out.println(this.name + " walk to the left");
    }

    @Override
    public void walkRight() {
        System.out.println(this.name + " walk to the right");
    }

    @Override
    public void walkForward() {
        System.out.println(this.name + " walk to the front");
    }

    @Override
    public void walkBackward() {
        System.out.println(this.name + " walk to the back");
    }

}

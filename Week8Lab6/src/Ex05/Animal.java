package Ex05;

public abstract class Animal {
    protected int legs;

    Animal() {

    }

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    void walk() {
        System.out.println("Animal is walking with " + this.legs + " legs.");
    }

}

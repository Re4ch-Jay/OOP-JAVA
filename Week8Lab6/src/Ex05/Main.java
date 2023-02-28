package Ex05;

public class Main {
    public static void main(String[] args) {

        Fish d = new Fish();
        d.walk();
        d.eat();
        d.getName();
        d.play();

        Cat c = new Cat("Fluffy");
        System.out.println(c.getName());
        c.eat();
        c.play();

        Animal a = new Fish();
        a.eat();
        a.walk();

        Animal e = new Spider();
        e.eat();

        Pet p = new Cat();
        p.getName();
        p.play();

    }
}

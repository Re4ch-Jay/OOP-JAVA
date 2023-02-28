package Ex05;

public class Fish extends Animal implements Pet {
    Fish() {
        System.out.println("Fish does not have legs");
    }

    @Override
    void walk() {
        System.out.println("Fish cannot walk");
    }

    @Override
    void eat() {
        System.out.println("Fish is eating");
    }
}

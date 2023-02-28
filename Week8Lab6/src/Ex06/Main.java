package Ex06;

public class Main {
    public static void main(String[] args) {
        Walkable human = new Human("Reach");
        Walkable animal = new Animal("Dog");

        human.walkRight();
        human.walkBackward();
        human.walkForward();
        human.walkLeft();

        animal.walkRight();
        animal.walkBackward();
        animal.walkForward();
        animal.walkLeft();
    }
}

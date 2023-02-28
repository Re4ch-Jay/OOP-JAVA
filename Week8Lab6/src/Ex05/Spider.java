package Ex05;

public class Spider extends Animal {

    public Spider(int legs) {
        super(legs);
        System.out.println("Spider has " + legs + " legs");
    }

    public Spider() {
        this(8);
    }

    @Override
    void eat() {
        System.out.println("Spider eat mosquitos");
    }

}

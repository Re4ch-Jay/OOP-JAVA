
public class Child extends Parent {

    /**
     * @param name
     */

    public Child() {
    }

    public void speak() {
        System.out.println(1);
    }

    public void eat() {
        this.speak();
    }

}

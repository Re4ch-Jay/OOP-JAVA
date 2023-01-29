public class Ex14 {
    public static void main(String[] args) {
        helloForLoop();
        helloWhileLoop();
        helloDoWhileLoop();
    }

    public static void helloForLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("helloForLoop " + i);
        }
    }

    public static void helloWhileLoop() {
        int i = 0;
        while (i < 10) {

            System.out.println("helloWhileLoop " + i);
            i++;
        }
    }

    public static void helloDoWhileLoop() {
        int i = 0;
        do {
            System.out.println("HelloDoWhile " + i);
            i++;
        } while (i < 10);
    }
}

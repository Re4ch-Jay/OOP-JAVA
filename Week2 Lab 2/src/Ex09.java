
public class Ex09 {
    public static void main(String[] args) {

        System.out.println(add(10, 20));
        System.out.println(minus(10, 20));
        System.out.println(div(10, 20));
        System.out.println(multi(10, 20));
        System.out.println(mod(10, 20));

    }

    static int add(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int multi(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }

}

// 9. Write a Java program to create and use the following functions:
// a. int add (int a, int b)
// b. int minus (int a, int b)
// c. int div (int a, int b)
// d. int multi (int a, int b)
// e. int mod (int a, int b)

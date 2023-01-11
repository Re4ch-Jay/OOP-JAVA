
public class Ex12 {
    public static void main(String[] args) {
        System.out.println(isEven(2));
    }

    static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true; // is even
        } else {
            return false; // not even
        }
    }
}

// 12. Write a Java program to create and use the function boolean isEven(int
// n); this
// function will return true if n is the Even number otherwise will return false

public class Ex11 {
    public static void main(String[] args) {
        System.out.println(isNegativeNumber(-5));

    }

    static boolean isNegativeNumber(int n) {
        if (n < 0) {
            return true;
        } else {
            return false;
        }
    }
}

// 11. Write a Java program to create and use the function boolean
// isNegativeNumber(int n);
// this function will return true if n is the negative number, otherwise will
// return false.
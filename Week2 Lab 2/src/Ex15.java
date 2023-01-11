public class Ex15 {
    public static void main(String[] args) {
        System.out.println(sum1(1.20, 0));
        System.out.println(sum2(112.0, 0.5));
        System.out.println(sum3(1110, 0.5));
        System.out.println(sum4(10, 110.2, 10.3));
    }

    static double sum1(double a, int b) {
        return a + b;
    }

    static double sum2(double a, double b) {
        return a + b;
    }

    static double sum3(int a, double b) {
        return a + b;
    }

    static double sum4(double a, double b, double c) {
        return a + b + c;
    }
}

// 15. Write a Java Program to create and use functions as below:
//  double sum(double a, int b);
//  double sum(double a, double b)
//  double sum(int a, double b)
//  double sum(double a, double b, double c)
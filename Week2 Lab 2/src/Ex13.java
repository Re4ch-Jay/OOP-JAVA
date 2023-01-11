
public class Ex13 {
    public static void main(String[] args) {
        int N = 7;
        mul_table(N, 10);
    }

    static void mul_table(int N, int i) {

        if (i > 10)
            return;
        System.out.println(N + " * " + i + " = " + N * i);

        mul_table(N, i + 1);
    }

}

// 13. Write a Java program to create and use the function void
// multiplyNumber(int n); this
// function will print the multiply() of n. Hint: not allow to use loop but can
// use operator
// (+-*/ )
// Example, if we call this function in the main function, multiplyNumber(7); it
// will
// print as the following :

public class Ex03 {
    public static void main(String[] args) {
        a();
        System.out.println();
        b();
        System.out.println();
        c();
        System.out.println();
        d();
    }

    public static void a() {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
    }

    public static void b() {
        int i, space, rows = 5, k = 0;
        for (i = 1; i <= rows; ++i, k = 0) {
            for (space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }
    }

    public static void c() {
        int rows = 5, i, j, space;
        for (i = rows; i >= 1; --i) {
            for (space = 0; space < rows - i; ++space)
                System.out.print(" ");
            for (j = i; j <= 2 * i - 1; ++j)
                System.out.print("*");
            for (j = 0; j < i - 1; ++j)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void d() {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 5; i >= 1; i--) {
            for (j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (j = 2; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

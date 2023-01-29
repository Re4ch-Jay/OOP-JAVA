public class Ex04 {
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
        int i, j, rows = 6;
        for (i = 1; i <= rows; ++i) {
            for (j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void b() {
        int i, j, rows = 6;
        for (i = rows; i >= 1; --i) {
            for (j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void c() {
        int i, j, rows = 6;
        for (i = 1; i <= rows; i++) {
            for (j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void d() {
        int i, j, rows = 6;
        for (i = 1; i <= rows; i++) {

            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (j = i; j <= rows; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

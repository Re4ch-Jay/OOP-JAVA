public class Ex07 {
    public static void main(String[] args) {
        int temp;
        int x = 10;
        int y = 20;
        
        System.out.println("Before swap");
        System.out.println("x: "+ x);
        System.out.println("y: "+y);

        temp = x;
        x = y;
        y = temp;
        System.out.println("After swap");
        System.out.println("x: "+ x);
        System.out.println("y: "+y);
    }
}

// 7. Write a Java program to swap two variables x and y
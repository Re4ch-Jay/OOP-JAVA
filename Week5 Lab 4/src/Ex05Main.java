public class Ex05Main {
    public static void main(String[] args) {
        Ex05Student student1 = new Ex05Student();
        student1.printInfo();
        System.out.println();

        Ex05Student student2 = new Ex05Student("Panhareach", "Phat", "ABC123");
        student2.printInfo();
        System.out.println();

        Ex05Student student3 = new Ex05Student("Panhareach", "Phat", "ABC123", "St Fake Street");
        System.out.println();
        student3.printInfo();

    }
}

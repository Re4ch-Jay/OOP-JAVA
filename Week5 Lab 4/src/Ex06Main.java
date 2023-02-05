import java.util.Arrays;
import java.util.Scanner;

public class Ex06Main {
    public static void main(String[] args) {

        Ex06Book[] listBooks = new Ex06Book[5];

        fillData(listBooks);
        System.out.println();
        printAll(listBooks);
        System.out.println();

        searchBookByTitle(listBooks, "Hello");
        System.out.println();

        searchBookByISBN(listBooks, "1-2-3");
        System.out.println();

        sortByISBN(listBooks);
        System.out.println();
        sortByTitle(listBooks);
        System.out.println();
    }

    public static void fillData(Ex06Book[] listBooks) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listBooks.length; i++) {

            System.out.print("Enter Title: ");
            String title = scanner.nextLine();

            System.out.print("Enter Author: ");
            String author = scanner.nextLine();

            System.out.print("Enter ISBN: ");
            String isbn = scanner.nextLine();

            System.out.print("Enter Publish year: ");
            int publishYear = scanner.nextInt();

            scanner.nextLine();

            Ex06Book book = new Ex06Book(title, author, isbn, publishYear);
            listBooks[i] = book;
        }

    }

    public static void printAll(Ex06Book[] listBooks) {
        System.out.println("List of books");
        for (int i = 0; i < listBooks.length; i++) {
            System.out.println("Author: " + listBooks[i].getAuthor());
            System.out.println("Title: " + listBooks[i].getTitle());
            System.out.println("ISBN: " + listBooks[i].getISBN());
            System.out.println("Publish year: " + listBooks[i].getPublishYear());
        }
    }

    public static void searchBookByTitle(Ex06Book[] listBooks, String title) {
        System.out.println("Search Book by title");
        for (int i = 0; i < listBooks.length; i++) {
            if (title.equals(listBooks[i].getTitle())) {
                System.out.println("Author: " + listBooks[i].getAuthor());
                System.out.println("Title: " + listBooks[i].getTitle());
                System.out.println("ISBN: " + listBooks[i].getISBN());
                System.out.println("Publish year: " + listBooks[i].getPublishYear());
            }
        }
    }

    public static void searchBookByISBN(Ex06Book[] listBooks, String isbn) {
        System.out.println("Search Book by ISBN");
        for (int i = 0; i < listBooks.length; i++) {
            if (isbn.equals(listBooks[i].getISBN())) {
                System.out.println("Author: " + listBooks[i].getAuthor());
                System.out.println("Title: " + listBooks[i].getTitle());
                System.out.println("ISBN: " + listBooks[i].getISBN());
                System.out.println("Publish year: " + listBooks[i].getPublishYear());
            }
        }
    }

    public static void sortByISBN(Ex06Book[] listBooks) {

        System.out.println("Sort books by ISBN");
        System.out.println("Before sort");
        System.out.println(Arrays.asList(listBooks));
        Arrays.sort(listBooks, (a, b) -> a.getISBN().compareTo(b.getISBN()));
        System.out.println("After");
        System.out.println(Arrays.asList(listBooks));

    }

    public static void sortByTitle(Ex06Book[] listBooks) {

        System.out.println("Sort books by Title");
        System.out.println("Before sort");
        System.out.println(Arrays.asList(listBooks));
        Arrays.sort(listBooks, (a, b) -> a.getTitle().compareTo(b.getTitle()));
        System.out.println("After");
        System.out.println(Arrays.asList(listBooks));

    }
}

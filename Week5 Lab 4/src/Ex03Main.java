public class Ex03Main {
    public static void main(String[] args) {
        Ex03Book book = new Ex03Book("Progamming in Java", "John Jackson", 1234567);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("ISBN: " + book.getISBN());

        book.setAuthor("Jack Jackson");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("ISBN: " + book.getISBN());

    }
}

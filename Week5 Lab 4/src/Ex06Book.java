public class Ex06Book {
    private String title, author, isbn;
    private int publishYear;

    public Ex06Book() {

    }

    public Ex06Book(String title) {
        this.title = title;
    }

    public Ex06Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Ex06Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Ex06Book(String title, String author, String isbn, int publishYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return ("(" + title + ", " + isbn + ", " + author + ", " + publishYear + ")");
    }

    public void setTitle(String title) {
        title = title;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public void setISBN(String isbn) {
        isbn = isbn;
    }

    public void setPublishYear(int publishYear) {
        publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void printInfo() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Publish Year: " + this.getPublishYear());
    }

}

public class Ex03Book {
    private String title, author;
    private int isbn;

    public Ex03Book() {

    }

    public Ex03Book(String title) {
        this.title = title;
    }

    public Ex03Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        title = title;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public void setISBN(int isbn) {
        isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getISBN() {
        return isbn;
    }
}

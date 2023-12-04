public class Book extends LibraryItem {
    private Person author;
    private String isbn;

    public Book(String title, Person author, String isbn) {
        super(title);
        this.author = author;
        this.isbn = isbn;
    }
    public Person getAuthor() {
        return author;
    }

    public String getISBN() {
        return isbn;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" %s %s", author.toString(), isbn);
    }
}

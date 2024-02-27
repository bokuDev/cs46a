/**
 * Represents a book with a title, author, and year of publication
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;

    /**
     * Constructs a new Book.
     *
     * @param title the title of the book.
     * @param author the author of the book.
     * @param yearPublished  the year the book was published
     */
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    // Add getter, setters, and other methods, each with its own Javadoc comment

    /**
     *
     * @return title the title of the book
     */
    String getTitle() { return this.title; }
}

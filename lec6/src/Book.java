// Canhui Huang
// Exercise 3
public class Book {
    private String title;
    private String author;
    private String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getters & Setters
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public String getISBN() { return this.ISBN; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public void displayBookInfo() {
        System.out.println("Book title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN + "\n");
    }

    public static void main(String[] args) {
        Book book1 = new Book("tarzan", "ramon", "1239877asdhk123");
        Book book2 = new Book("The beauty beast", "Karen Kuhsti", "21309sample23");
        Book book3 = new Book("Pedro and his comrades", "Juan", "09237IS0293sam1");

        book1.displayBookInfo();
        book2.displayBookInfo();
        book3.displayBookInfo();
    }
}

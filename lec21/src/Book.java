public class Book {
        private String title;
        private String author;
        private int yearPublished;

        Book() {}
        Book(String title, String author, int yearPublished) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
        }

        public String getBookInfo() {
            return "Book title: " + this.title +
                    "\nAuthor: " + this.author +
                    "\nYear published: " + this.yearPublished;
        }

        public static void main(String[] args) {
            Book book = new Book("Little Woman", "Cassandra Bullocks", 1890);

            System.out.println(book.getBookInfo());
        }
}

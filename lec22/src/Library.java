public class Library {
    public String libraryName;
    protected int numberOfBooks;
    private String libraryAddress;

    Library() {
        this.libraryName = "";
        this.numberOfBooks = 0;
        this.libraryAddress = "";
    }

    Library(String libraryName, int numberOfBooks, String libraryAddress) {
        this.libraryName = libraryName;
        this.numberOfBooks = numberOfBooks;
        this.libraryAddress = libraryAddress;
    }

    void displayLibraryInfo() {
        System.out.println("Library name: " + this.libraryName +
                "\nNumber of Books: " + this.numberOfBooks +
                "\nLibrary address: " + this.libraryAddress);
    }

    public static void main(String[] args) {
        LocalLibrary localLibrary = new LocalLibrary("San Jose Libary", 498, "11th Street, San Jose, CA");
        System.out.println("Trying to access library name: " + localLibrary.libraryName);
        System.out.println("Trying to access number of books: " + localLibrary.numberOfBooks);
        System.out.println("Trying to access library address: " + "localLibrary.libraryAddress (Unable to access)");

        System.out.println("\nlocalLibrary.displayLibraryInfo():");
        localLibrary.displayLibraryInfo();
    }
}

class LocalLibrary extends Library {
    LocalLibrary() {
        super();
    }

    LocalLibrary(String libraryName, int numberOfBooks, String libraryAddress) {
        super(libraryName, numberOfBooks, libraryAddress);
    }
}

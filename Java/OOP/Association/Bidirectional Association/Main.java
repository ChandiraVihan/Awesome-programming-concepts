import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private Library library;  // Reference to the Library it belongs to

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        book.setLibrary(this);  // Set the reference to this Library in the Book
    }

    public List<Book> getBooks() {
        return books;
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984");
        Book book2 = new Book("To Kill a Mockingbird");

        library.addBook(book1);
        library.addBook(book2);

        for (Book book : library.getBooks()) {
            System.out.println("Library has: " + book.getTitle() + " which belongs to library: " + book.getLibrary());
        }
    }
}
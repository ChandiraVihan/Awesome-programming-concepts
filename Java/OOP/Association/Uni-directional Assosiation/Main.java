import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
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
            System.out.println("Library has: " + book.getTitle());
        }
    }
}
import java.util.ArrayList;

class Book {
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("-------------------");
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully.");
    }

    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.ISBN.equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class Problem2 {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Prajwal's Book 1", "Prajwal Katkar", "162");
        Book b2 = new Book("Prajwal's Book 2", "Katkar Prajwal", "261");

        lib.addBook(b1);
        lib.addBook(b2);

        System.out.println("\nAvailable Books:");
        lib.displayBooks();

        lib.removeBook("162");

        System.out.println("\nAfter Removing Book:");
        lib.displayBooks();
    }
}

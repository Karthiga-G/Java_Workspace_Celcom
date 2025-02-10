package Assignment1;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    private List<Book> books;
    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                book.displayBookInfo();
            }
        }
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "James Gosling", "978-0132350884");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "978-0132350885");
        Book book3 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0201616224");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook("978-0132350885");

        library.displayBooks();
    }
}


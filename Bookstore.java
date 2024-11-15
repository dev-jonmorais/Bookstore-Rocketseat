package Model;

import java.util.ArrayList;
import java.util.List;

public class Bookstore {
    // LIST
    private List<Book2> books;
    private List<Author> authors;

    public Bookstore() {
        books = new ArrayList<Book2>();
        authors = new ArrayList<Author>();
    }

    public void addBook(Book2 book) {
        books.add(book);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public List<Book2> getAvailableBooks() {
        List<Book2> availableBooks = new ArrayList<>();
        for (Book2 book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }

    public Book2 findBookById(int id) {
        for (Book2 book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(int id) {
        Book2 book = findBookById(id);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("You have successfully borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book not available for loan.");
        }
    }
}

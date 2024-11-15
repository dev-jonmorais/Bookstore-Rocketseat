import Model.Book2;
import Model.Bookstore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bookstore library = new Bookstore();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            //...
            System.out.println("1. Add a new book");
            System.out.println("2. List all available books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book2 book = new Book2(library.getAvailableBooks().size() + 1, title, author);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.println("Available books:");
                    for (Book2 availableBook : library.getAvailableBooks()) {
                        System.out.println(availableBook);
                    }
                    break;
                case 3:
                    System.out.print("Enter book id to borrow: ");
                    int bookId = scanner.nextInt();
                    library.borrowBook(bookId);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
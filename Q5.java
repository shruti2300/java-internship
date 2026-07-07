import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author;
    }
}

public class Q5 {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int nextId = 1;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Remove a Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = readInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    removeBook();
                    break;
                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        sc.close();
    }

    static void addBook() {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        Book book = new Book(nextId++, title, author);
        books.add(book);
        System.out.println("Book added successfully!");
    }

    static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        System.out.println("\n--- List of Books ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    static void searchBook() {
        System.out.print("Enter title to search: ");
        String title = sc.nextLine();
        boolean found = false;

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Book Found: " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    static void removeBook() {
        displayBooks();
        if (books.isEmpty()) return;

        System.out.print("Enter Book ID to remove: ");
        int id = readInt();

        Book toRemove = null;
        for (Book b : books) {
            if (b.id == id) {
                toRemove = b;
                break;
            }
        }

        if (toRemove != null) {
            books.remove(toRemove);
            System.out.println("Book removed successfully!");
        } else {
            System.out.println("Book with ID " + id + " not found.");
        }
    }

    static int readInt() {
        int value = sc.nextInt();
        sc.nextLine(); 
        return value;
    }
}

    public class EmployeeDemo {
    	public static void main(String[] args) {
    }
        // Create a book and a patron
        Book book = new Book("The Hobbit", "J.R.R. Tolkien", "978-0007525492");
        Patron patron = new Patron("Alice", "P123");

        // Display initial state
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
        System.out.println("Available: " + book.isAvailable());
        System.out.println("Patron: " + patron.getName() + " (ID: " + patron.getPatronId() + ")");
        System.out.println("Books borrowed: " + patron.getBooksBorrowed());

        // Borrowing the book
        book.checkout();
        patron.borrowBook();

        // Returning the book
        book.returnBook();
        patron.returnBook();

        // Display final state
        System.out.println("Available now: " + book.isAvailable());
        System.out.println("Books borrowed now: " + patron.getBooksBorrowed());
    

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    // Getters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return available; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public void setAvailable(boolean available) { this.available = available; }

    // Check out the book
    public void checkout() {
        if (available) {
            available = false;
            System.out.println("Book checked out.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Return the book
    public void returnBook() {
        available = true;
        System.out.println("Book returned.");
    }
}

public class Patron {
    private String name;
    private String patronId;
    private int booksBorrowed;

    // Constructor
    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.booksBorrowed = 0;
    }

    // Getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }
    public int getBooksBorrowed() { return booksBorrowed; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setPatronId(String patronId) { this.patronId = patronId; }
    public void setBooksBorrowed(int booksBorrowed) { this.booksBorrowed = booksBorrowed; }

    // Borrow a book
    public void borrowBook() {
        booksBorrowed++;
        System.out.println(name + " borrowed a book.");
    }

    // Return a book
    public void returnBook() {
        if (booksBorrowed > 0) {
            booksBorrowed--;
            System.out.println(name + " returned a book.");
        } else {
            System.out.println(name + " has no books to return.");
        }
    }



}}
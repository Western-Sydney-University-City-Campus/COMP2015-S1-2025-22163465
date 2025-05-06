package pracweek9;
/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    //DEFAULT CONSTRUCTURE
    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.available = false;
    }

    /**
     
     * @param title The title of the book
     * @param author The author of the book
     * @param ISBN The International Standard Book Number
     * @param available The availability status of the book
     */
    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    /**   
     * @return The title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the book's author
     * @param author The author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the book's ISBN
     * @return The ISBN of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the book's ISBN
     * @param ISBN The ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return The availability status of the book
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * @param available The availability status to set
     */
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
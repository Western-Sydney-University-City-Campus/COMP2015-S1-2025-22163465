package pracweek9;
/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
public class Patron {
    private String name;
    private String patronID;
    private int booksBorrowed;

 Patron() {
        this.name = "";
        this.patronID = "";
        this.booksBorrowed = 0;
    }

    /**
     * @param name The name of the patron
     * @param patronID Unique identifier for the patron
     * @param booksBorrowed Number of books currently borrowed
     */
    public Patron(String name, String patronID, int booksBorrowed) {
        this.name = name;
        this.patronID = patronID;
        this.booksBorrowed = booksBorrowed;
    }

    /**
     * @return The name of the patron
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The patron ID
     */
    public String getPatronID() {
        return patronID;
    }

    /**
     * @param patronID The ID to set
     */
    public void setPatronID(String patronID) {
        this.patronID = patronID;
    }

    /**
     * @return The number of books borrowed
     */
    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    /**
     * @param booksBorrowed The number of books to set
     */
    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }
}
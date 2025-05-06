package pracweek9;
/**
 * Represents a library patron with their details and borrowed books count
 */
public class Patron {
    private String name;
    private String patronID;
    private int booksBorrowed;

    /**
     * Default constructor initializes fields with empty/default values
     */
    public Patron() {
        this.name = "";
        this.patronID = "";
        this.booksBorrowed = 0;
    }

    /**
     * Parameterized constructor initializes fields with provided values
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
     * Gets the patron's name
     * @return The name of the patron
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the patron's name
     * @param name The name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the patron's ID
     * @return The patron ID
     */
    public String getPatronID() {
        return patronID;
    }

    /**
     * Sets the patron's ID
     * @param patronID The ID to set
     */
    public void setPatronID(String patronID) {
        this.patronID = patronID;
    }

    /**
     * Gets the number of books borrowed
     * @return The number of books borrowed
     */
    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    /**
     * Sets the number of books borrowed
     * @param booksBorrowed The number of books to set
     */
    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }
}
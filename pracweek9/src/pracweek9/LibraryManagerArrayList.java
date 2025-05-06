package pracweek9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagerArrayList {
    /**
     * Main method to manage library operations
     * @param args Command line arguments (not used)
     * @throws FileNotFoundException 
     */
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Patron> patrons = new ArrayList<>();
        
        // Read book data
        readBooksFromFile("booklist.csv", books);
        // Read patron data
        readPatronsFromFile("patronlist.csv", patrons);
        
        // Display summary
        displaySummary(books, patrons);
    }

    /**
     * Reads book data from file into ArrayList
     * @param filename Name of the file to read from
     * @param books ArrayList to store Book objects
     * @throws FileNotFoundException 
     */
    private static void readBooksFromFile(String filename, ArrayList<Book> books) throws FileNotFoundException {
        File file = new File(filename);
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                books.add(new Book(data[0], data[1], data[2], Boolean.parseBoolean(data[3])));
            }
            scanner.close();
        } else {
            System.out.println("Error: Book file not found");
        }
    }

    /**
     * Reads patron data from file into ArrayList
     * @param filename Name of the file to read from
     * @param patrons ArrayList to store Patron objects
     * @throws FileNotFoundException 
     */
    private static void readPatronsFromFile(String filename, ArrayList<Patron> patrons) throws FileNotFoundException {
        File file = new File(filename);
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                patrons.add(new Patron(data[0], data[1], Integer.parseInt(data[2])));
            }
            scanner.close();
        } else {
            System.out.println("Error: Patron file not found");
        }
    }

    /**
     * Displays summary of library data
     * @param books ArrayList of Book objects
     * @param patrons ArrayList of Patron objects
     */
    private static void displaySummary(ArrayList<Book> books, ArrayList<Patron> patrons) {
        System.out.println("\nLibrary Summary (ArrayList Implementation)");
        System.out.println("\nBooks:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
        
        System.out.println("\nPatrons:");
        for (Patron patron : patrons) {
            System.out.println(patron.getName() + " (ID: " + patron.getPatronID() + ")");
        }
    }
}
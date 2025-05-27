/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
package pracweek9;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LibraryManagerArray {
    private static final int MAX_BOOKS = 20;
    private static final int MAX_PATRONS = 9;

    
    public static void main(String[] args) throws FileNotFoundException {
        Book[] books = new Book[MAX_BOOKS];
        Patron[] patrons = new Patron[MAX_PATRONS];
        
        // BOOK DATA READ
        int bookCount = readBooksFromFile("booklist.csv", books);
        // PATRON DATA READ
        int patronCount = readPatronsFromFile("patronlist.csv", patrons);
        
        // Display summary
        displaySummary(books, bookCount, patrons, patronCount);
    }

    /**
    
     * @param filename Name of the file to read from
     * @param books Array to store Book objects
     * @return Number of books read
     */
    private static int readBooksFromFile(String filename, Book[] books) throws FileNotFoundException {
        int count = 0;
        File file = new File(filename);
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine() && count < MAX_BOOKS) {
                String[] data = scanner.nextLine().split(",");
                books[count] = new Book(data[0], data[1], data[2], Boolean.parseBoolean(data[3]));
                count++;
            }
            scanner.close();
        } else {
            System.out.println("Error: Book file not found");
        }
        return count;
    }

    /**  
     * @param filename Name of the file to read from
     * @param patrons Array to store Patron objects
     * @return Number of patrons read
     */
    private static int readPatronsFromFile(String filename, Patron[] patrons) throws FileNotFoundException {
        int count = 0;
        File file = new File(filename);
        if (file.exists()) {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine() && count < MAX_PATRONS) {
                String[] data = scanner.nextLine().split(",");
                patrons[count] = new Patron(data[0], data[1], Integer.parseInt(data[2]));
                count++;
            }
            scanner.close();
        } else {
            System.out.println("Error: Patron file not found");
        }
        return count;
    }

    /**
     * @param books Array of Book objects
     * @param bookCount Number of books in array
     * @param patrons Array of Patron objects
     * @param patronCount Number of patrons in array
     */
    private static void displaySummary(Book[] books, int bookCount, Patron[] patrons, int patronCount) {
        System.out.println("\nLibrary Summary (Array Implementation)");
        System.out.println("\nBooks:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i].getTitle() + " by " + books[i].getAuthor());
        }
        
        System.out.println("\nPatrons:");
        for (int i = 0; i < patronCount; i++) {
            System.out.println(patrons[i].getName() + " (ID: " + patrons[i].getPatronID() + ")");
        }
    }
}
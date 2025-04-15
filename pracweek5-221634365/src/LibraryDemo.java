
import java.util.Scanner;
public class LibraryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        // Get book info from user
        System.out.print("Enter book title: ");
        String title = kb.nextLine();

        System.out.print("Enter book author: ");
        String author = kb.nextLine();

        System.out.print("Enter book ISBN: ");
        String isbn = kb.nextLine();

        
        Book book = new Book(title, author, isbn);

      
        System.out.print("Enter patron name: ");
        String name = kb.nextLine();

        System.out.print("Enter patron ID: ");
        String patronId = kb.nextLine();

        Patron patron = new Patron(name, patronId);
		
		System.out.println("Book: " + Book.getTitle() + " by " + Book.getAuthor());
        System.out.println("Available: " + Book.isAvailable());
        System.out.println("Patron: " + Patron.getName() + " (ID: " + Patron.getPatronId() + ")");
        System.out.println("Books borrowed: " + Patron.getNumberofbooksBorrowed());

        // Borrowing the book
        Book.checkbook();
        Patron.NumberofbookBorrowed();

        // Returning the book
        Book.returnBook();
        Patron.returnBook();

        // Display final state
        System.out.println("Available now: " + Book.isAvailable());
        System.out.println("Books borrowed now: " + Patron.getNumberofbooksBorrowed());}
		
		
		}
		
		
			
		

	



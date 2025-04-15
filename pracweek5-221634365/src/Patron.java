
public class Patron {
		private static String Name;
		private static String PatrinId;
		private static int NumberofbooksBorrowed;
		
		
		

		    // Constructor to initialize the book attributes
		    public Patron(  String PatrinId, String Name) {
		        this.Name = Name;
		        this.PatrinId = PatrinId;
		        this.NumberofbooksBorrowed = 0;
		    }

		    // Getters methods for all attributes
		    public static String getName() {
		    	return Name; 
		    	}
		    public static String getPatronId() { 
		    	return PatrinId; 
		    	}
		    public static int getNumberofbooksBorrowed() {
		    	return NumberofbooksBorrowed;
		    	}

		    // Setters methods for all the attributes
		    public void setName(String Name) {
		    	this.Name = Name;
		    	}
		    public void setPatronId(String PatronId) {
		    	this.PatrinId = PatronId;
		    	}
		    
		    public void setBooksBorrowed(int NumberofbooksBorrowed) { 
		    	this.NumberofbooksBorrowed = NumberofbooksBorrowed; }

		    // Borrow a book
		    public static void NumberofbookBorrowed () {
		        NumberofbooksBorrowed++;
		        System.out.println(Name + " borrowed a book.");
		    }

		    // Return a book
		    public static void returnBook() {
		        if (NumberofbooksBorrowed > 0) {
		            NumberofbooksBorrowed--;
		            System.out.println(Name + " returned a book.");
		        } 
		    }
		}



public class Book {
	 private static String Title;
	 private static String Author;
	 private String ISBN;
	 private static boolean available;
	 
	 //Constructor to initialize the book attributes
	 public Book (String Title , String Author, String ISBN) {
	 this.Title = Title;
	 this.Author = Author;
	 this.ISBN= ISBN;
	 this.available = true;}
	 //Getter methods for all attributes of book class
	 public static String getTitle() { 
		 return Title;
		 }
	    public static String getAuthor() { 
	    	return Author;
	    	}
	    public String getIsbn() { 
	    	return ISBN; 
	    	}
	    public static boolean isAvailable() { 
	    	return available; 
	    	}
	   // setter methods for all attributes of book class
	    public void setTitle(String title) { 
	    	this.Title = title;
	    	}
	    public void setAuthor(String author) { 
	    	this.Author = author; 
	    	}
	    public void setIsbn( String ISBN) {
	    	this.ISBN = ISBN;
	    	}
	    public void setAvailable(boolean available) {
	    	this.available = available;
	    	}
	 
	    public static void checkbook() {
	    	if (available) {
	    		available= false;
	    		System.out.print("book checked out");
	    		
	    	}}
	    	public static void returnBook() { 
	    		available = true ;
	    		System.out.println ("book returned");
	    }

}

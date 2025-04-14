
import java.util.Scanner;

public class BookShop {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    double price=0;
    double quantity=0;
    String paymentMethod;
    double payedAmount=0;
    double totalDue=0;
    String cash;
    String CreditCard = null  ;
    double owing;
    
    System.out.print("Enter price of the book");
    price = kb.nextDouble();
    
    if ( price <= 0) {System.out.print("Invalid Input ");
	 return;}
	 

    System.out.print("Enter the quantity of the book");
    quantity = kb.nextDouble();
   
    
    if ( quantity < 0) {System.out.print("Invalid Input");
	 return;
    }
	 System.out.print("Enter payed amount ");
	    payedAmount=kb.nextDouble();
	    
	 
    
    kb.nextLine();
    
    
    
    System.out.print("Enter payment method Cash / Credit Card   ");
    paymentMethod=kb.nextLine();
    
    
    
   
    
    
    totalDue= price * quantity;
    owing = totalDue - payedAmount;
    
    
    
    if( paymentMethod.equalsIgnoreCase("CreditCard") )  {
    	System.out.println("Purchase Summary");
    	System.out.println("================");
    	System.out.println("Total Due " + totalDue);
    	System.out.println("----------------");
    	System.out.println("Credit card Payment " + payedAmount);
    	System.out.println("Owing" + owing );
    	System.out.println("================= ");
        
        
    	
	 }
    else {System.out.print("Purchase Summary");
	System.out.println("================");
	System.out.println("Total Due " + totalDue);
	System.out.println("----------------");
	System.out.println("Cash " + payedAmount);
	System.out.println("Owing" + owing );
	System.out.println("================= ");}
    
	 
    
    
    
    

}}
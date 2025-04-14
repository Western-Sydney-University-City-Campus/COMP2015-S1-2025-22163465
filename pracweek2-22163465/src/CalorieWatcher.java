import java.util.Scanner;

public class CalorieWatcher {
	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double Eatennumber = 0;
        double servescalories= 0;
        double Totalcalories= 0;
        System.out.print("Enter the number of cookies eaten: ");
       
        
            Eatennumber  = kb.nextInt();
            
             if (Eatennumber  > 0 ) {
                servescalories = Eatennumber / 40.0 * 10;
                Totalcalories  = servescalories  * 300;

                System.out.println("Totalcalories had: " + Totalcalories + " Number of cookie eaten " + Eatennumber );
            } 
             
             else {System.out.println("Invalid input. Please enter a whole number.");}
        

        }}

   
	
	
	
		
		
	
	



	
	  






import java.util.Scanner;

public class StockCommission {
	public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double  numberShare= 0;
        double shareprice = 0;
        double stockcost = 0;
        double Commission = 0;
        double TotalSpent= 0;
        
        	System.out.print("Enter the number of share: ");
        	numberShare = kb.nextDouble();
        	
        	
        	System.out.print("Enter the price of the share:");
        	shareprice = kb.nextDouble();
        	
        	stockcost= numberShare * shareprice;
        	Commission= 4.5/100 * stockcost;
        	TotalSpent= stockcost + Commission;
        	
        	
        	
        	
        	
        	if (numberShare > 100 && numberShare < 100000 && shareprice > 0 && shareprice <= 500) {
        		System.out.print("Stock Cost:" + shareprice  + "----"+"Commission:" + Commission  +"----"  +   "Total:"+ TotalSpent);
        		}
        	else { System.out.print("Invalid input");}
        
      
       
       
       
       
       
           
        

	}}

   
	
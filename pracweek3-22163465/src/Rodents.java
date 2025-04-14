import java.util.Scanner;

public class Rodents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
		 
		 int startingPop=0;
		 int incrasePerc=0;
		 int numberOfYear=0;
		 int population=0;
		 int totalPopulation=0;
		 
		 
		 System.out.print("enter starting population of rodent of unusaual size");
		 startingPop= kb.nextInt();
		 
		 if (startingPop < 300) { System.out.print("Please enter a number greater tahn 300");
		 return;
		 
		 }		
		 System.out.print("enter Annual percentage increase");
		 incrasePerc= kb.nextInt();
		 if ( incrasePerc < 0) {System.out.print("Enter number greater than 0 ");
		 return;}
		 
		 
		 System.out.print("enter Number of year they will multyply ");
		 numberOfYear=kb.nextInt();
		 if(numberOfYear < 10) {System.out.print("Enter year greater than 10");
		 return;
		 }
		 
		 
		 population= startingPop + startingPop/100 ;
		 totalPopulation= numberOfYear* population;
		 
		 
		 System.out.print("Population: " + totalPopulation +" --- Year: "+ numberOfYear);
		 
		 
		 
		 
		

	}

}

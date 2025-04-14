
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
		 
		 
		 startingPop = validInt(kb, "Enter the starting pop of unuasal six=ze rodent: ", 300);
	     incrasePerc = validInt(kb, "Enter annual increase percentage: ", 0);
	     numberOfYear = validInt(kb, "Enter the number of years: ", 10);

		 
		 
		 population= startingPop + incrasePerc/100 ;
		 totalPopulation= numberOfYear* population;
		 
		 
		 System.out.print("Population: " + totalPopulation +" --- Year: "+ numberOfYear);
		 
		 
		 
		 
		

	}
	
	public static int validInt(Scanner kb, String min, int minValue) {
		int value = -1;
		while (value < minValue) {
			System.out.print(min);
		value = kb.nextInt();
		System.out.println("Value must be >= " + minValue + ".");}
		return value;
	}

}

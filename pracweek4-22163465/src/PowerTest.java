import java.util.Scanner;
public class PowerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=0;
		int exponent=0;
		int result=0;
		
		Scanner kb = new Scanner(System.in);
		// positivenumber method makes sure the number entered is positive
		base = positivenumber( kb, "Enter base: ");
		 
		exponent = positivenumber(kb, "Enter exponent: ");
		
		
		result = power(base, exponent);
		
		
		System.out.println("Answer: " + base + "^" + exponent + " = " + result);

	}
	// Performs the power calculation
	public static int power(int base, int exponent) {
		int pow= 1;
		for (int i=0; i< exponent; i++){
		pow=pow*base;}
		return pow;
	    
	}
	
	// Makes sure the number entered is positive
	public static int positivenumber(Scanner kb, String positive) {
	    int value = -1;
	    while (value < 0) {
	        System.out.print(positive);
	        value = kb.nextInt();
	            if (value < 0) {
	                System.out.println("Value must be >= 0.");
	            }
	        }
		return value; 
	}
}





		
import java.util.Scanner;

		public class BankAccountDemo {
		    public static void main(String[] args) {
		        Scanner kb = new Scanner(System.in);

		        
		        System.out.print("Enter account number: ");
		        String accountNumber = kb.nextLine();

		        System.out.print("Enter account holder name: ");
		        String accountHolderName = kb.nextLine();

		        System.out.print("Enter initial balance: $");
		        double balance = kb.nextDouble();

		     
		        System.out.println("--- Account Created ---");
		        System.out.println("Account Holder: " + accountHolderName );
		        System.out.println("Account Number: " + accountNumber );
		        System.out.println("initialBlance:" + balance);
		        
		     
		        System.out.print("\nEnter amount to deposit: $");
		        double depositAmount = kb.nextDouble();
		        BankAccount.deposit(depositAmount);
		        System.out.printf("Balance after deposit: ", BankAccount.getbalance());

		        
		        System.out.print("Enter amount to withdraw: $");
		        double withdrawAmount = kb.nextDouble();
		       
		        System.out.printf("Balance after withdrawal: $", BankAccount.getbalance());

		       
		        
		        


		    }
			
		       
	
	
	
	}


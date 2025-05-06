/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
import java.util.Scanner;

public class BankAccountDemo_22163465
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int months = 3; // 3 MONTH TEST

        for (int month = 1; month <= months; month++) {
            System.out.println("Month " + month + " ---");

            // THE MONTLY TOTAL RESET
            BankAccount_22163465.resetMonthTotals();

           
            performTransactions(kb);

            // BONUS INTREST CHECK
            checkBonusInterest();
        }

       
    }

    /**
     * TRANSCATION IS DONE WITH USER INPUT
     */
    private static void performTransactions(Scanner kb) {
        System.out.print("Enter number of deposits: ");
        int numDeposits = kb.nextInt();
        for (int i = 0; i < numDeposits; i++) {
            System.out.print("Enter deposit amount: $");
            double amount = kb.nextDouble();
            BankAccount_22163465.deposit(amount);
        }

        System.out.print("Enter number of withdrawals: ");
        int numWithdrawals = kb.nextInt();
        for (int i = 0; i < numWithdrawals; i++) {
            System.out.print("Enter withdrawal amount: $");
            double amount = kb.nextDouble();
            BankAccount_22163465.withdraw(amount);
        }
    }
// THE COMMANDS CHECK IF THE USER QUALIFIES FOR BONUS INTREST
    private static void checkBonusInterest() {
        double balance = BankAccount_22163465.getbalance();
        double deposits = BankAccount_22163465.getMonthDeposits();
        double withdrawals = BankAccount_22163465.getMonthWithdrawals();

        System.out.println(" End of Month Summary");
        System.out.printf("Current Balance: ", balance);
        System.out.printf("Total Deposits: ", deposits);
        System.out.printf("Total Withdrawals: ", withdrawals);

        if (balance > 1000 && deposits >= 200 && withdrawals == 0) {
            System.out.println("Congratulations! You qualify for the 0.15% bonus interest.");
        } else {
            System.out.println("No bonus interest this month.");
        }
    }
}
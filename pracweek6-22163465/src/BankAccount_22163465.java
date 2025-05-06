/*
 * Name: Dikshant karki
 * Student ID: 22163465
 */
public class BankAccount_22163465 {  
    private static double balance; 
    private static String accountNumber; 
    private static String accountHolderName; 
    private static double monthDeposits; // New field for total deposits in the month
    private static double monthWithdrawals; // New field for total withdrawals in the month

    
    /**
     * 
     * @param TO DEPOSIT POSITIVE AMOUNT
     */
    public static void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            monthDeposits += amount; // Track monthly deposits
            System.out.println(amount + " deposited."); 
        } 
    } 

   
    /**
    
     * @param THE AMOUNT TO BE WITHDRAWED POSITIVE AND GREATER AND EQUEALS TO BALANCE
     */
    public static void withdraw(double amount) { 
        if (amount > 0 && amount <= balance) { 
            balance -= amount; 
            monthWithdrawals += amount; // Track monthly withdrawals
            System.out.println(amount + " withdrawn."); 
        } 
    } 

    
    /**
     
     * @return GIVES THE CURRENT BALANCE
     */
    public static double getbalance() { 
        return balance; 
    } 

    // Getters 
    /**
     * @return THE ACCOUNT NUMBER
     */
    public static String getaccountNumber() { 
        return accountNumber; 
    } 

    /**
    
     * @return GIVES THE ACCOUNT HOLDWERS NAME
     */
    public static String getaccountHolderName() { 
        return accountHolderName; 
    }

    // New getters for monthly totals
    /**
     * @return THE AMOUNT OF TOTAL MONTHLY DEPOSIT
     */
    public static double getMonthDeposits() {
        return monthDeposits;
    }

    /**
     * @return THE AMOUNT OF TOTAL WITHDRAWALS IN THE MONTH
     */
    public static double getMonthWithdrawals() {
        return monthWithdrawals;
    }

    
    /**
     * THE MONTHLY WITHDRAWL AND DEPOSIT RESET
     */
    public static void resetMonthTotals() {
        monthDeposits = 0;
        monthWithdrawals = 0;
    }
}

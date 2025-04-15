
public class BankAccount {  
private static double balance;
private static String accountNumber;
private static String accountHolderName;

// Deposit method
public static void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println(amount + " deposited.");
    } 
}

// Withdraw method
public static void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println( amount + " withdrawn.");
    } 
}

// Get current balance
public static double getbalance() {
    return balance;
}

// Getters
public static String getaccountNumber() {
    return accountNumber;
}

public static String getaccountHolderName() {
    return accountHolderName;







}
}



package Oct.Chapter14_OOPS.Encapsulation;


// Class to demonstrate encapsulation
class BankAccount {

    // Step 1: Declare private fields (data hiding)
    private String accountHolderName; // Stores the name of the account holder
    private double balance;           // Stores the account balance

    // Step 2: Create a public getter method to access the accountHolderName
    public String getAccountHolderName() {
        return accountHolderName; // Returns the value of accountHolderName
    }

    // Step 3: Create a public setter method to set the accountHolderName
    public void setAccountHolderName(String name) {
        this.accountHolderName = name; // Assigns the input value to accountHolderName
    }

    // Step 4: Create a public getter method to access the balance
    public double getBalance() {
        return balance; // Returns the current balance
    }

    // Step 5: Create a public setter method to set the balance
    public void setBalance(double amount) {
        // Validate that the balance cannot be negative
        if (amount >= 0) {
            this.balance = amount; // Assigns the input value to balance
        } else {
            System.out.println("Balance cannot be negative!"); // Error message for invalid input
        }
    }
}

public class Lab040 {
    public static void main(String[] args) {

        // Step 6: Create an object of the BankAccount class
        BankAccount account = new BankAccount();

        // Step 7: Set values using setter methods
        account.setAccountHolderName("Vrushali Nivangune"); // Set account holder name
        account.setBalance(5000); // Set initial balance

        // Step 8: Get values using getter methods
        System.out.println("Account Holder: " + account.getAccountHolderName()); // Print account holder name
        System.out.println("Account Balance: $" + account.getBalance()); // Print account balance

        // Step 9: Try setting an invalid balance
        account.setBalance(-1000); // Attempt to set a negative balance

    }
}


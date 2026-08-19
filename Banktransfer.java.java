class Account {
    int accountNumber;
    String name;
    double balance;

    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    // Transfer money from this account to another account
    void transfer(Account receiver, double amount) {
        if (amount <= 0) {
            System.out.println("Invalid transfer amount.");
        } 
        else if (balance >= amount) {
            balance -= amount;
            receiver.balance += amount;

            System.out.println("Transfer successful!");
            System.out.println("Amount transferred: Rs. " + amount);
        } 
        else {
            System.out.println("Transfer failed: Insufficient balance.");
        }
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs. " + balance);
        System.out.println();
    }
}

public class BankTransfer {
    public static void main(String[] args) {

        Account account1 = new Account(101, "Rahul", 10000);
        Account account2 = new Account(102, "Amit", 5000);

        System.out.println("Before Transfer:");
        account1.display();
        account2.display();

        // Passing account2 object as a parameter to account1's method
        account1.transfer(account2, 3000);

        System.out.println("After Transfer:");
        account1.display();
        account2.display();
    }
}

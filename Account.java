// Encapsulated Account class
class Account {
    // Private data member
    private double balance;

    // No-argument constructor (Default balance = 0)
    public Account() {
        this.balance = 0;
    }

    // Parameterized constructor (Initial balance)
    public Account(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance! Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Getter method to get balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money (Only if balance is sufficient)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Runner class to test Account class
 class Account2 {
    public static void main(String[] args) {
        // Creating first account with an initial balance
        Account acc1 = new Account(500);
        System.out.println("Account 1 created:");
        acc1.displayBalance();

        System.out.println();

        // Creating second account with the same balance as the first (Using getBalance())
        Account acc2 = new Account(acc1.getBalance());
        System.out.println("Account 2 created with same balance as Account 1:");
        acc2.displayBalance();

        System.out.println();

        // Performing transactions on Account 1
        acc1.deposit(200);
        acc1.withdraw(150);
        System.out.println("Updated Account 1:");
        acc1.displayBalance();

        System.out.println();

        // Performing transactions on Account 2
        acc2.deposit(100);
        acc2.withdraw(700); // Should fail due to insufficient balance
        System.out.println("Updated Account 2:");
        acc2.displayBalance();
    }
}


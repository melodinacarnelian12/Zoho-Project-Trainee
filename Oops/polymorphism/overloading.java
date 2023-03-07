public class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountType;

    public BankAccount(double balance, String accountNumber, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

    public void transfer(double amount, BankAccount destinationAccount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            destinationAccount.deposit(amount);
        }
    }

    public void transfer(double amount, String destinationAccountNumber) {
        if (balance - amount < 0) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("$" + amount + " transferred to account number " + destinationAccountNumber);
        }
    }
}


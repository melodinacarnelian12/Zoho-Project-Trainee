abstract class Bank {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public Bank(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Bank {
    private double interestRate;

    // Constructor for savings account
    public SavingsAccount(String accountHolderName, int accountNumber, double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("New balance: " + newBalance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("New balance: " + newBalance);
    }

    public double  calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        return interest;
    }
}

class CheckingAccount extends Bank {
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName, int accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() + overdraftLimit >= amount) {
            double newBalance = getBalance() - amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("New balance: " + newBalance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        double newBalance = getBalance() + amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("New balance: " + newBalance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("John Doe", 12345, 1000, 2.5);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        CheckingAccount checkBalanceAccount = new CheckingAccount("Jane Doe", 56788, 5000, 1000);

        System.out.println("Savings Account Details:");
        System.out.println(savingsAccount.getAccountHolderName ());
        System.out.println(savingsAccount.getAccountNumber ());
        System.out.println(savingsAccount.getBalance ());
        System.out.println("Interest earned: " + savingsAccount.calculateInterest() + "\n");

        System.out.println("Checking Account Details:");
        System.out.println(checkBalanceAccount.getAccountHolderName ());
        System.out.println(checkBalanceAccount.getAccountNumber ());
        System.out.println(checkBalanceAccount.getBalance ());
        System.out.println("Available balance: " + checkBalanceAccount.getBalance());
    }
}

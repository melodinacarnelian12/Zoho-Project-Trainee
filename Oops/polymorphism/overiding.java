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
        balance -= amount;
    }
}

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, String accountNumber, String accountType, double interestRate) {
        super(balance, accountNumber, accountType);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 0) {
            System.out.println("Insufficient funds.");
        } else {
            super.withdraw(amount);
        }
    }

    public double calculateInterest() {
        return getBalance() * interestRate;
    }
}


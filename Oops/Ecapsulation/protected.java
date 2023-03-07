public class Bank {
    protected String name;
    protected int accountNumber;
    protected double balance;
    
    public Bank(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    protected void deposit(double amount) {
        balance += amount;
    }
    
    protected void withdraw(double amount) {
        balance -= amount;
    }
}

public class SavingsAccount extends Bank {
    private double interestRate;
    
    public SavingsAccount(String name, int accountNumber, double balance, double interestRate) {
        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    public void addInterest() {
        double interest = balance * interestRate;
        deposit(interest);
    }
}

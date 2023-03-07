public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    private void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    private void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
     private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String getEmail() {
        return email;
    }
    
     private void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
     private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " made. New balance is " + balance);
    }
    
    public void withdraw(double amount) {
        if(balance < amount) {
            System.out.println("Insufficient balance. Current balance is " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance is " + balance);
        }
    }
}

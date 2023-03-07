public class Account {
   protected int accountId;
   protected double balance;

   public Account(int accountId, double balance) {
      this.accountId = accountId;
      this.balance = balance;
   }

   public void deposit(double amount) {
      this.balance += amount;
   }

   public void withdraw(double amount) {
      this.balance -= amount;
   }

   public double getBalance() {
      return this.balance;
   }
}

public class SavingsAccount extends Account {
   private double interestRate;

   public SavingsAccount(int accountId, double balance, double interestRate) {
      super(accountId, balance);
      this.interestRate = interestRate;
   }

   public double calculateInterest() {
      return this.balance * this.interestRate;
   }
}

public class FixedDepositAccount extends SavingsAccount {
   private int termInMonths;

   public FixedDepositAccount(int accountId, double balance, double interestRate, int termInMonths) {
      super(accountId, balance, interestRate);
      this.termInMonths = termInMonths;
   }

   public double calculateInterest() {
      return this.balance * this.interestRate * (this.termInMonths / 12.0);
   }
}

public interface BankAccount {
   public void deposit(double amount);
   public void withdraw(double amount);
   public double getBalance();
}


public class SavingsAccount implements BankAccount {
   private double balance;

   public SavingsAccount(double initialBalance) {
      balance = initialBalance;
   }

   public void deposit(double amount) {
      balance += amount;
   }

   public void withdraw(double amount) {
      if (amount <= balance) {
         balance -= amount;
      } else {
         System.out.println("Insufficient balance.");
      }
   }

   public double getBalance() {
      return balance;
   }
}


public class BankSystem {
   public static void main(String[] args) {
      SavingsAccount myAccount = new SavingsAccount(1000.0);
      myAccount.deposit(500.0);
      myAccount.withdraw(200.0);
      System.out.println("Current balance: " + myAccount.getBalance());
   }
}

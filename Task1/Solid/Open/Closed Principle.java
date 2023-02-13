Open/Closed Principle (OCP):
A class should be open for extension but closed for modification.

interface Transaction {
    void execute();
}

class DepositTransaction implements Transaction {
    private BankAccount account;
    private double amount;

    public DepositTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        account.deposit(amount);
    }
}

class WithdrawTransaction implements Transaction {
    private BankAccount account;
    private double amount;

    public WithdrawTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    public void execute() {
        account.withdraw(amount);
    }
}

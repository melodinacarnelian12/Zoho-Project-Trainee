Dependency Inversion Principle (DIP):
High-level modules should not depend on low-level modules. Both should depend on abstractions.

interface Bank {
    void deposit(double amount);

    void withdraw(double amount);
}

class BankAccount implements Bank {
    private double balance;

    public void deposit(double amount) {
        private double amount;
    }
}

Liskov Substitution Principle (LSP):
Subtypes must be substitutable for their base types.

class Atm {
    private int[] transactions;

    public Atm(int[] transactions) {
        this.transactions = transactions;
    }

    public void run() {
        for (Transaction t : transactions) {
            t.execute();
        }
    }
}

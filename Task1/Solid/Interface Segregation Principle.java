Interface Segregation Principle (ISP):
A client should not be forced to depend on interfaces it does not use.

interface Swipe {
    void swipe();
}

class Atm implements Swipe {
    private Transaction[] transactions;

    public Atm(Transaction[] transactions) {
        this.transactions = transactions;
    }

    public void run() {
        for (Transaction t : transactions) {
            t.execute();
        }
    }

    public void swipe() {
        System.out.println("ATM card swiped");
    }
}

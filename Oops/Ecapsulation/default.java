package com.example.bank;

public class Bank {
    public int balance;
    void setBalance(int amount) {
        balance = amount;
    }
}


package com.example;

import com.example.bank.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.balance = 1000; 
        bank.setBalance(2000); // ERROR: setBalance has default access
    }
}

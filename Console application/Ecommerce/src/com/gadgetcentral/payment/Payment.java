package com.gadgetcentral.payment;

import java.util.*;
import static com.gadgetcentral.customer.Customer.userIndex;
import static com.gadgetcentral.customer.Customer.wallet_bal;

public class Payment {
    Scanner sc = new Scanner ( System.in );
    public void deposit() {
        System.out.println ( "--------------------------------------------" );
        System.out.println ( "--------------------------------------------" );
        System.out.println ( "         Deposit Cash , " );
        System.out.println ( "--------------------------------------------" );
        System.out.println ( "--------------------------------------------" );
        System.out.println ( "Please Select the appropriate option." );
        try {
            System.out.println ( "Wallet Balance : " + wallet_bal.get ( userIndex ) );
        } catch (Exception ignored) {

        }
        System.out.println ( "1 - Deposit\n2- Exit\n" );
        System.out.print ( "Choice : " );
        int com = sc.nextInt ( );
        sc.nextLine ( );
        if (com == 1) {
            System.out.print ( "Amount : " );
            int cash = sc.nextInt ( );
            sc.nextLine ( );
            try {
                int old_balance = wallet_bal.get ( userIndex );

            cash = old_balance + cash;
            }catch(Exception e){
            }
            wallet_bal.set ( userIndex, cash );
            System.out.println ( "Cash Deposited\nNew Balance : " + wallet_bal.get ( userIndex ) );
        } else {
            System.out.println ( "Invalid Cash" );
        }
    }
}

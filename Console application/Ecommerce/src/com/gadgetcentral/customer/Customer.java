package com.gadgetcentral.customer;

import java.util.*;

public class Customer {
    public static int userNumber = 1;
    public static ArrayList<String> userName = new ArrayList<> ( List.of ( "Mel" ) );
    public static ArrayList<String> userId = new ArrayList<> ( List.of ( "M1" ) );
    public static ArrayList<Integer> pins = new ArrayList<> ( List.of ( 1234 ) );
    public static ArrayList<String> Address = new ArrayList<> ();
    public static ArrayList<Long> phoneNumber = new ArrayList<> ( List.of ( 9575655L ) );


    public static ArrayList<Integer> wallet_bal = new ArrayList<> ( ) {{
        add ( 0 );
    }};
    public static int userIndex;
}

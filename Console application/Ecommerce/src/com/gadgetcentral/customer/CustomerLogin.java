package com.gadgetcentral.customer;

import java.util.*;
import static com.gadgetcentral.customer.AuthenticationService.*;

public class CustomerLogin {
    Scanner sc = new Scanner ( System.in );

    public void customer_login() {
        int tries = 0;

        while (tries++ < 3) {
            System.out.println ( "----------------------------------------------------" );
            System.out.println ( "----------------------------------------------------" );
            System.out.println ( "          Welcome Customer     " );
            System.out.println ( "----------------------------------------------------" );
            System.out.println ( "----------------------------------------------------" );
            System.out.println ( "Please Enter your Login Credentials" );
            System.out.print ( "Please Enter your User Id: " );
            String user_id = sc.next ( );
            sc.nextLine ( );
            if (is_userC ( user_id ) != -1) {
                AuthenticationService cu = new AuthenticationService ( );
                cu.AuthenticationService ( user_id );
                CustomerMenu c1 = new CustomerMenu ( );
                System.out.print ( "Password : " );
                int pin = sc.nextInt ( );
                if (cu.is_user ( pin )) {
                    c1.customer_menu ( );
                    break;
                } else {
                    System.out.println ( "Entered Password is wrong. Please Try Again." );
                }
            } else {
                System.out.println ( "User Not Found. Please Try Again." );
            }
        }
        if (tries == 3) {
            System.out.println ( "Maximum Attempts Exceeded, Please Try again  after some time." );
            System.out.println ( "Press Enter to continue..." );

        }
    }
}

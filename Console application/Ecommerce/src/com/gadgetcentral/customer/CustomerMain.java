package com.gadgetcentral.customer;

import java.util.Scanner;

public class CustomerMain {
    Scanner sc = new Scanner ( System.in );

    public void customer_welcome() {
        int option;
        loop:
        while (true) {

            System.out.println ( "----------------------------------------------" );
            System.out.println ( "----------------------------------------------" );
            System.out.println ( "         Welcome Customer     " );
            System.out.println ( "----------------------------------------------" );
            System.out.println ( "----------------------------------------------" );
            System.out.println ( "Please Select the appropriate option." );
            System.out.println ( "1 - Already Having an Account at GadgetCentral\n2 - New to GadgetCentral\n3 - Back" );

            System.out.print ( "Choice : " );
            option = sc.nextInt ( );

            switch ( option ) {
                case 1:
                    CustomerLogin customerLogin=new CustomerLogin ();
                    customerLogin.customer_login ( );
                    break;
                case 2:
                    CustomerRegistration customerRegistration = new CustomerRegistration ( );
                    customerRegistration.customer_reg ( );
                    break;
                case 3:
                    break loop;
                default:
                    System.out.println ( "Please Enter a valid input!" );
                    break;
            }
        }
    }

}

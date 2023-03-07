package com.gadgetcentral.customer;

import com.gadgetcentral.cart.CustomerCart;
import com.gadgetcentral.categories.CategoryMain;
import java.util.*;
import com.gadgetcentral.payment.Payment;

public class CustomerMenu {
    Scanner sc=new Scanner(System.in);
    public void customer_menu(){
        int com ;
       loop :while(true){
            System.out.println("---------------------------------------------------------------");
            System.out.println("---------------------------------------------------------------");
            System.out.println("        Welcome Customer ");
            System.out.println("        We are pleased to have you here               ");
           System.out.println ( "---------------------------------------------------------------" );
           System.out.println ( "---------------------------------------------------------------" );
           System.out.println ( "Please Select the appropriate option." );
           System.out.println ( "1 Categories\n2 - Shopping Cart\n3  Deposit Cash in Wallet\n4 - Exit" );

           System.out.print ( "Choice : " );
           com = sc.nextInt ( );
           sc.nextLine ( );

           switch ( com ) {
               case 1:
                   CategoryMain categoryMain=new CategoryMain ();
                   categoryMain.categories ( );
                   break;
               case 2:
                   CustomerCart customerCart=new CustomerCart ();
                    customerCart.cartOperations();
                    break;
                case 3:
                    Payment payment=new Payment ();
                    payment.deposit();
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }
    }
}

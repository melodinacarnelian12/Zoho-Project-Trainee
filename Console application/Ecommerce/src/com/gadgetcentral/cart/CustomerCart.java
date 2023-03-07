package com.gadgetcentral.cart;

import com.gadgetcentral.order.CheckOut;
import com.gadgetcentral.product.ProductImplementation;
import java.util.*;
import static com.gadgetcentral.cart.CartImplementation.cartData;
import static com.gadgetcentral.customer.Customer.userIndex;
import static com.gadgetcentral.vendor.Vendor.usr_index;

public class CustomerCart {
    Scanner sc = new Scanner ( System.in );

    public  void cartOperations() {
        while (true) {
            System.out.println ( "------------------------------------------------------" );
            System.out.println ( "------------------------------------------------------" );
            System.out.println ( "         Cart         " );
            System.out.println ( "------------------------------------------------------" );
            System.out.println ( "------------------------------------------------------" );
            ArrayList<Integer> cartContent = null;
            try {
                cartContent = cartData.get ( usr_index ).getItems ( );
            } catch (Exception e) {
            }
            assert cartContent != null;
            if (cartContent.size ( ) == 0) {
                System.out.println ( "The Cart is Empty" );
            }
            for (int k = 0; k < cartContent.size ( ); k++) {
                int i = cartContent.get ( k );
                System.out.println ( "Product ID : " + i + "\n" + ProductImplementation.names.get ( i ) + "\n" + ProductImplementation.scripts.get ( i ) + "\nPrice:" + ProductImplementation.prices.get ( i ) + "\nCount: " + cartData.get ( usr_index ).counts.get ( k ) + "\n" );
            }
            System.out.println ( "Options:\n1 - Check out\n2 - Remove Product\n3 - Go Back" );

            System.out.print ( "Choice : " );
            int com = sc.nextInt ( );
            sc.nextLine ( );

            if (com == 1) {
                if (cartContent.size ( ) == 0) {
                    System.out.println ( "The cart is Empty!." );
                } else {
                    CheckOut checkOut = new CheckOut ( );
                    if (checkOut.checkOut ( )) {
                        break;
                    }
                }
            } else if (com == 2) {
                if (cartContent.size ( ) == 0) {
                    System.out.println ( "There is nothing in cart to remove." );
                } else {
                    System.out.print ( "Enter Product Id : " );
                    int rem_prod = sc.nextInt ( );
                    sc.nextLine ( );
                    System.out.print ( "Count : " );
                    int count = sc.nextInt ( );
                    cartData.get ( userIndex ).removeItem ( rem_prod, count );
                }
                System.out.print ( "Press Enter to Exit..." );
            } else {
                break;
            }


        }
    }

}

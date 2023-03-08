package com.gadgetcentral.order;

import com.gadgetcentral.product.ProductImplementation;

import java.util.List;
import java.util.Scanner;

import static com.gadgetcentral.cart.CartImplementation.cartData;
import static com.gadgetcentral.customer.Customer.userIndex;
import static com.gadgetcentral.customer.Customer.wallet_bal;


public class CheckOut {
    Scanner sc = new Scanner ( System.in );

    public boolean checkOut() {
        boolean order_complete = false;

        while (true) {
            System.out.println ( "---------------------------------------------------------" );
            System.out.println ( "---------------------------------------------------------" );
            System.out.println ( "com/gadgetcentral/cart            " );
            System.out.println ( "---------------------------------------------------------" );
            System.out.println ( "---------------------------------------------------------" );
            List<Integer> cartContent = cartData.get ( userIndex ).getItems ( );
            int overallPrice = 0;

           
            System.out.println ( "Product                                           Count          Price" );

            for (int i = 0; i < cartContent.size ( ); i++) {
                String prod_name = ProductImplementation.names.get ( i );
                int count = cartData.get ( userIndex ).counts.get ( i );
                int price = ProductImplementation.prices.get ( i ) * count;

                System.out.printf("%-50s%-15s%d\n", prod_name, count, price);
                Order_receipt.append(String.format("%-50s%-15s%d\n", prod_name, count, price));

                overallPrice = overallPrice + price;
            }

            System.out.println ( "Total Price: " + overallPrice );
            Order_receipt.append ( "Total Price: " ).append ( overallPrice );

            System.out.println ( "\nSelect one of the options:\n1 - Proceed to Payment\n2 - Go Back to Cart" );
            int com = sc.nextInt ( );
            sc.nextLine ( );

            if (com == 1) {
                System.out.println ( "\nSelect one of the options:\n1 - Pay Via Wallet\n2 - Cash on Delivery\nAny other - Return" );
                int pay_opt = sc.nextInt ( );
                sc.nextLine ( );

                if (pay_opt == 1) {
                    if (wallet_bal.get ( userIndex ) >= overallPrice) {
                        wallet_bal.set ( userIndex, overallPrice );
                        System.out.println ( "Your order has been Successfully Placed." );
                        cartData.get ( userIndex ).clearCart ( );
                        order_complete = true;
                        break;
                    } else {
                        System.out.println ( "You don't have required balance in wallet." );
                    }
                } else if (pay_opt == 2) {
                    System.out.println ( "Your order has been Successfully Placed on Cash On Delivery." );
                    cartData.get ( userIndex ).clearCart ( );
                    order_complete = true;
                    break;
                } else {
                    System.out.println ( "Invalid Input." );
                }
            } else if (com == 2) {
                break;
            } else {
                System.out.println ( "Enter a Valid input." );
            }
            System.out.print ( "Press Enter to Exit..." );
            sc.nextLine ( );
        }
        return order_complete;
    }
}

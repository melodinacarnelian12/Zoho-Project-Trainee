package com.gadgetcentral.categories;

import com.gadgetcentral.product.ProductImplementation;
import java.util.*;
import static com.gadgetcentral.product.ProductImplementation.prod_oper;

public class CategoryMain {

    public static void categories() {

        Scanner sc = new Scanner ( System.in );
        CategoryMain categoryMain = new CategoryMain ( );
        int com;
        loop:
        while (true) {

            System.out.println ( "----------------------------------------------" );
            System.out.println ( "----------------------------------------------" );
            System.out.println ( "         Product Categories , " );
            System.out.println ( "----------------------------------------------" );
            System.out.println ( "----------------------------------------------" );
            System.out.println ( "Please Select the appropriate option." );
            System.out.println ( "1 - Wearable Gadgets\n2 - Electronics Gadgets\n3 - Smart Gadgets\n4 - Back" );

            System.out.print ( "Choice : " );
            com = sc.nextInt ( );
            sc.nextLine ( );


            switch ( com ) {
                case 1:
                    categoryMain.category ( 1 );
                    break;
                case 2:
                    categoryMain.category ( 2 );
                    break;
                case 3:
                    categoryMain.category ( 3 );
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println ( "Please Enter a valid input" );
            }
        }
    }

    public void category(int cat) {
        String catog;
        switch ( cat ) {
            case 1 -> {
                catog = "Wearable Gadgets";
                prod_oper ( "Categories , " + catog, ProductImplementation.filter_catog ( 1 ) );
            }
            case 2 -> {
                catog = "Electronics Gadgets";
                prod_oper ( "Categories , " + catog, ProductImplementation.filter_catog ( 2 ) );
            }
            case 3 -> {
                catog = "Smart Gadgets";
                prod_oper ( "Categories , " + catog, ProductImplementation.filter_catog ( 3 ) );
            }
        }

    }
}

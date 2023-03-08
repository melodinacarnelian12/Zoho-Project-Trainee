package com.gadgetcentral.product;

import java.util.Scanner;

import static com.gadgetcentral.vendor.Vendor.enter_wait;
import static com.gadgetcentral.vendor.Vendor.usr_index;

public class VendorProductManagement {
    Scanner sc = new Scanner ( System.in );

    public void manage_product() {
        int com = 0;
        while (true) {
            System.out.println ( "--------------------------------------------------------------" );
            System.out.println ( "--------------------------------------------------------------" );
            System.out.println ( "      Manage Products on GadgetCentral   " );
            System.out.println ( "--------------------------------------------------------------" );
            System.out.println ( "--------------------------------------------------------------" );
            System.out.println ( "Option\n1 - Remove Product\n2 - Edit Product\n3 - Exit" );
            int[] prods = ProductImplementation.filter_vendor ( usr_index );
            if (prods.length == 0) {
                System.out.println ( "No Products Added, Add more products to continue" );
            }
            for (int i : prods) {
                System.out.println ( "Product ID : " + i + "\n" + ProductImplementation.names.get ( i ) + "\n" + ProductImplementation.scripts.get ( i ) + "\nPrice:" + ProductImplementation.prices.get ( i ) + "\n" );
            }

            if (com == -1) {
                System.out.println ( "Please Enter a Valid Input" );
            }

            System.out.print ( "Choice : " );
            com = sc.nextInt ( );
            sc.nextLine ( );
            if (com == 1) {
                System.out.print ( "Product Id:" );
                int prod_id = sc.nextInt ( );
                sc.nextLine ( );
                if (prod_id <= ProductImplementation.nos) {
                    if (ProductImplementation.sellerIds.get ( prod_id ) == usr_index) {
                        ProductImplementation.removeProduct ( prod_id );
                        System.out.println ( "The Product is Successfully removed" );
                    } else {
                        System.out.println ( "The Product is not under your ownership to remove" );
                    }
                } else {
                    System.out.println ( "The Product Doesn't Exists" );
                }

            } else if (com == 2) {
                System.out.print ( "Product Id:" );
                int prod_id = sc.nextInt ( );
                sc.nextLine ( );
                System.out.println ( "Option\n1 - Name\n2 - Description\n3 - Price\n4 - Stock\n5 - Category\n6 - Cancel" );
                System.out.print ( "Choice : " );
                int edt_com = sc.nextInt ( );
                sc.nextLine ( );
                switch ( edt_com ) {
                    case 1:
                        System.out.println ( "Old Name :" + ProductImplementation.names.get ( prod_id ) );
                        System.out.print ( "New Value : " );
                        String val1 = sc.nextLine ( );
                        ProductImplementation.names.set ( prod_id, val1 );
                        break;
                    case 2:
                        System.out.println ( "Old Description :" + ProductImplementation.scripts.get ( prod_id ) );
                        System.out.print ( "New Description : " );
                        String val2 = sc.nextLine ( );
                        ProductImplementation.scripts.set ( prod_id, val2 );
                        break;
                    case 3:
                        System.out.println ( "Old Price :" + ProductImplementation.prices.get ( prod_id ) );
                        System.out.print ( "New Price : " );
                        int val3 = sc.nextInt ( );
                        sc.nextLine ( );
                        ProductImplementation.prices.set ( prod_id, val3 );
                        break;
                    case 4:
                        System.out.println ( "Old Stock :" + ProductImplementation.stocks.get ( prod_id ) );
                        System.out.print ( "New Stock : " );
                        int val4 = sc.nextInt ( );
                        sc.nextLine ( );
                        ProductImplementation.stocks.set ( prod_id, val4 );
                        break;
                    case 5:
                        System.out.println ( "Old Category :" + ProductImplementation.catogs.get ( prod_id ) );
                        System.out.print ( "New Category : " );
                        int val5 = sc.nextInt ( );
                        sc.nextLine ( );
                        ProductImplementation.catogs.set ( prod_id, val5 );
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println ( "Enter a valid Input" );
                }
            } else if (com == 3) {
                break;
            } else {
                com = -1;
            }
            enter_wait ( );
        }
    }

    public void add_product() {
        System.out.println ( "--------------------------------------------------" );
        System.out.println ( "--------------------------------------------------" );
        System.out.println ( "      Add Products    " );
        System.out.println ( "--------------------------------------------------" );
        System.out.println ( "--------------------------------------------------" );
        System.out.print ( "Product Name : " );
        String prod_name = sc.nextLine ( );

        System.out.print ( "Product Description : " );
        String prod_scripts = sc.nextLine ( );

        System.out.print ( "Category : " );
        int catog = sc.nextInt ( );
        sc.nextLine ( );

        System.out.print ( "Price : " );
        int price = sc.nextInt ( );
        sc.nextLine ( );

        System.out.print ( "stock : " );
        int stock = sc.nextInt ( );
        sc.nextLine ( );


        System.out.println ( "Confirm Entered Data ? (yes/no)" );
        String conf = sc.next ( );
        sc.nextLine ( );
        if (conf.equals ( "yes" )) {
            ProductImplementation.addProduct ( prod_name, price, usr_index, prod_scripts, stock, catog );
            System.out.println ( "The Product has been successfully Added" );
            enter_wait ( );
        } else {
            System.out.println ( "Entered Details Discarded" );
            enter_wait ( );
        }
    }


}












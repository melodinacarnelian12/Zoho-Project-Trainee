package com.gadgetcentral.product;

import java.util.*;
import static com.gadgetcentral.cart.CartImplementation.cartData;
import static com.gadgetcentral.vendor.Vendor.usr_index;

public class ProductImplementation {
    public static ArrayList<String> names = new ArrayList<> ( );
    public static ArrayList<Integer> prices = new ArrayList<> ( );
    public static ArrayList<Integer> sellerIds = new ArrayList<> ( );
    public static ArrayList<String> scripts = new ArrayList<> ( );
    public static ArrayList<Integer> stocks = new ArrayList<> ( );
    public static ArrayList<Integer> catogs = new ArrayList<> ( );
    static Scanner sc = new Scanner ( System.in );
    static int nos = 1;

    public static void addProduct(String name, int price, int sellerId, String discript, int stock, int catog) {
        names.add ( name );
        prices.add ( price );
        sellerIds.add ( sellerId );
        scripts.add ( discript );
        stocks.add ( stock );
        catogs.add ( catog );
        nos++;
    }

    public static void removeProduct(int ind) {
        names.remove ( ind );
        prices.remove ( ind );
        sellerIds.remove ( ind );
        scripts.remove ( ind );
        stocks.remove ( ind );
        catogs.remove ( ind );
        nos--;
    }

    public static ArrayList<Integer> append(ArrayList<Integer> arr, int key) {
    ArrayList<Integer> temp = new ArrayList<>(arr);
    temp.add(key);
    return temp;
}


//     public static ArrayList<Integer> filter_catog(int cat) {
//         ArrayList<Integer> temp = new ArrayList<> ( );
//         try {
//             for (int k = 0; k < nos; k++) {
//                 if (catogs.get ( k ) == cat) {
//                     temp.add ( k );
//                 }
//             }
//         } catch (Exception ignored) {

//         }
//         return temp;
//     }

//     public static int[] filter_vendor(int vendor_id) {
//         int[] temp = {};
//         try {
//             for (int k = 0; k < nos; k++) {
//                 if (sellerIds.get ( k ) == vendor_id) {
//                     temp = append ( temp, k );
//                 }
//             }
//         } catch (Exception ignored) {
//         }
//         return temp;
//     }


    public static void prod_oper(String head, ArrayList<Integer> arr) {
        int com = 0;
        while (true) {
            System.out.println ( "----------------------------------" );
            System.out.println ( "     " + head );

            System.out.println ( "Options:\n1 -  Add a product to cart\n2 - return to Previous Page" );

            if (com == -1) {
                System.out.println ( "Please Choose a valid input!" );
            }

            System.out.print ( "Choice : " );
            com = sc.nextInt ( );
            sc.nextLine ( );

            if (com == 1) {
                System.out.print ( "Adding Product to cart (-1 to cancel)\nProduct Id : " );
                int prod_id = sc.nextInt ( );
                sc.nextLine ( );
                System.out.print ( "Count : " );
                int count = sc.nextInt ( );
                sc.nextLine ( );
                if (count < 1) {
                    System.out.println ( "Invalid Count" );
                } else {
                    cartData.get ( usr_index ).addItem ( prod_id, count );
                    System.out.print ( "Press Enter to Exit..." );
                    sc.nextLine ( );
                }
                break;
            } else if (com == 2) {
                System.out.print ( "Press Enter to Exit..." );
                sc.nextLine ( );
                break;
            } else {
                com = -1;
            }

        }
    }
}


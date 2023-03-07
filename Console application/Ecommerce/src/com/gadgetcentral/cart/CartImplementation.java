package com.gadgetcentral.cart;

import com.gadgetcentral.product.ProductImplementation;

import java.util.*;
public class CartImplementation{
    static CartImplementation cart1 = new CartImplementation();

        public static ArrayList<CartImplementation> cartData = new ArrayList<>(List.of(cart1));

        public ArrayList<Integer> prod_ids = new ArrayList<>();
        public ArrayList<Integer> counts = new ArrayList<>();

        public CartImplementation(){
        }

        public void addItem(int prod_id, int count) {
            int index = prod_ids.indexOf(prod_id);
            if (index != -1) {
                counts.set(index, counts.get(index) + count);
            } else {
                prod_ids.add(prod_id);
                counts.add(count);
            }
        }

        public ArrayList<Integer> getItems() {

            return new ArrayList<>(prod_ids);
        }


        public void clearCart(){
            prod_ids.clear();
            counts.clear();
        }

       protected void removeItem(int prod_id,int count) {
            int index = prod_ids.indexOf(prod_id);
            if (index != -1) {
                ProductImplementation.stocks.set(prod_id, counts.get(index)-count);
                prod_ids.remove(index);
                counts.remove(index);
                System.out.println("Product Removed");
            } else {
                System.out.println("The Entered Product is not Found");
            }
        }

    }

package com.gadgetcentral.customer;

import com.gadgetcentral.cart.CartImplementation;

import java.util.*;
import static com.gadgetcentral.customer.Customer.*;

public class AuthenticationService {

    public static ArrayList<Integer> append(ArrayList<Integer> arr, int key) {
        arr.add(key);
        return arr;
    }

    public static ArrayList<CartImplementation> append(ArrayList<CartImplementation> arr, CartImplementation key) {
        arr.add(key);
        return arr;
    }

    public static ArrayList<String> append(ArrayList<String> arr, String key) {
        arr.add(key);
        return arr;
    }
    public void AuthenticationService(String user_id) {
        userIndex = userId.indexOf ( user_id );
    }

    public static int is_userC(String user_id) {
        return userId.indexOf(user_id);
    }

    public static boolean number_exists(long num) {
        return Collections.singletonList(phoneNumber).contains(num);
    }

    public boolean is_user(int pincode) {
        return pins.get(userIndex) == pincode;
    }
}

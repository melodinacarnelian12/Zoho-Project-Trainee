package com.gadgetcentral.customer;
import java.util.*;

import static com.gadgetcentral.customer.Customer.*;
import static com.gadgetcentral.customer.Customer.pins;
import static com.gadgetcentral.customer.AuthenticationService.*;
import static com.gadgetcentral.cart.CartImplementation.cartData;
import com.gadgetcentral.cart.CartImplementation;

public class CustomerRegistration {
    int userNumber=0;
    Scanner sc= new Scanner(System.in);
    public  void customer_reg() {
        while (true) {
            long phoneNumber;
            String userIdRegistration;

            System.out.println("--------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------");
            System.out.println("         Welcome To GadgetCentral Customer Registration    ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------");
            System.out.print("Please Enter the User Name : ");

            String user_name = sc.nextLine();

            do {
                System.out.print("Please Enter the User Id : ");
                userIdRegistration = sc.nextLine();

                if (is_userC(userIdRegistration) != -1) {
                    System.out.println("User Name Already Exists. Please Try another user Name .");
                }
               } while (is_userC(userIdRegistration) != -1);


            System.out.print("Password : ");
            int pin = sc.nextInt();


            System.out.print("Enter the Address : ");
            String address = sc.nextLine();


            do {
                System.out.print("Phone Number : ");
                phoneNumber = sc.nextLong();
                if (number_exists(phoneNumber)) {
                    System.out.println("Phone Number Already Exists. Please Try another.");
                }
            } while (number_exists(phoneNumber));


            System.out.println("Confirm Entered Data ? (Proceed/Cancel)");
            String conf = sc.next();sc.nextLine();
            if (conf.trim().equalsIgnoreCase("proceed")) {

                userName.add(user_name);
                userId .add(userIdRegistration);
                pins.add(pin);
                CartImplementation cart = new CartImplementation();
                AuthenticationService.append(cartData, cart);
                userNumber++;


                System.out.println("Congratulations, You are successfully registered !");
                System.out.print("Press Enter to Continue..");
                sc.nextLine();
               break;
            }

        }
    }
}

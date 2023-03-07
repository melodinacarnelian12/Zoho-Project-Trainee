package com.gadgetcentral.application;


import com.gadgetcentral.admin.AdminLogin;
import com.gadgetcentral.customer.CustomerMain;
import com.gadgetcentral.vendor.VendorMain;

import java.util.*;

public class GadgetCentral {
    static Scanner sc = new Scanner(System.in);

    public static void welcome() {
        while (true) {
            System.out.println("------------------------------------------------------");
            System.out.println("------------------------------------------------------");
            System.out.println("            Hello Welcome  to GadgetCentral  ");
            System.out.println("            We are pleased to have you here!!!!!!!!!!!!  ");
            System.out.println("------------------------------------------------------");
            System.out.println("------------------------------------------------------");
            System.out.println("Select User Type:\nCustomer\nVendor\nAdmin\nExit");
            System.out.print("Choice : ");
            String inputString = sc.nextLine();
            if (inputString.trim().equalsIgnoreCase( "customer" )) {
                CustomerMain customerMain=new CustomerMain ();
                customerMain.customer_welcome();
            } else if (inputString.trim().equalsIgnoreCase( "vendor" )) {
                VendorMain vendorMain=new VendorMain ();
                vendorMain.vendor_welcome();
            } else if (inputString.trim().equalsIgnoreCase( "admin" )) {
                AdminLogin.admin_login();
            } else if (inputString.trim().equalsIgnoreCase("Exit")) {
                System.exit(0);
            } else {
                System.out.println("Please Enter a valid Choice.");
            }
        }
    }

}

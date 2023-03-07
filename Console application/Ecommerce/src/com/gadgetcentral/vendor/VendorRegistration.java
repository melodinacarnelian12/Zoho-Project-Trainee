package com.gadgetcentral.vendor;
import java.util.*;

public class VendorRegistration {
     Scanner sc=new Scanner(System.in);

    public void vendor_reg(){
        while(true)
        {

            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
            System.out.println("         Welcome To GadgetCentral Vendor Registration    ");
            System.out.println("------------------------------------------------");
            System.out.println("------------------------------------------------");
            System.out.print("Please Enter your User Name : ");
            String user_name = sc.next(); sc.nextLine();

            String mId = "GC" + (101 + Vendor.user_nos);
            System.out.println("The VendorId Generated for you : "+mId);


            System.out.print("Password :  ");
            int pin = sc.nextInt(); sc.nextLine();


            System.out.println("Confirm Entered Data ? (Proceed/Cancel)");
            String conf = sc.next(); sc.nextLine();
            if(conf.trim().equalsIgnoreCase("Proceed")){

                Vendor.user_names.add(user_name);
                Vendor.user_ids.add(mId);
                Vendor.pins.add(pin);
                Vendor.status.add(0);
                Vendor.user_nos++;

                System.out.println("Congratulations, You are successfully registered !. Please enter_wait until you are accepted as a Verified Vendor");
                System.out.print("Press Enter to Continue..");
                sc.nextLine();
                break;
            }

        }
    }
}

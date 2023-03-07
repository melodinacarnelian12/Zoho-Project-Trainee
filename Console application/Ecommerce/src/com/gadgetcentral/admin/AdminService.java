package com.gadgetcentral.admin;

import java.util.*;
import com.gadgetcentral.vendor.Vendor;
import static com.gadgetcentral.vendor.Vendor.*;

public class AdminService {
    Scanner sc = new Scanner(System.in);
    protected void addVendor()
    {
        while (true)
        {

            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.println("       Add New Vendor    ");
            System.out.println("---------------------------------------------------------");
            System.out.println("---------------------------------------------------------");
            System.out.print("Please Enter the User Name : ");
            String user_name = sc.next();
            sc.nextLine();

            String vId = "GC" + (101 + Vendor.user_nos);
            System.out.println("The Vendor Id Generated for the Vendor :" + vId);


            System.out.print("Password (Use Numbers - 5 digit) : ");
            int pin = sc.nextInt();
            sc.nextLine();


            System.out.println("Confirm Entered Data ? (Proceed/Cancel)");
            String conf = sc.next();
            sc.nextLine();
            if (conf.trim().equalsIgnoreCase("Proceed")){

                user_names.add(user_name);
                user_ids.add(vId);
                pins.add(pin);
                status.add(1);
                Vendor.user_nos++;

                System.out.println("Vendor Added Successfully");
                System.out.print("1- Add Another User, 2- Back");
                int com = sc.nextInt();
                sc.nextLine();

                if (com!=1) {
                    break;
                }
            }

        }
    }

    protected void blockVendor()
    {
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("        Block Vendor    ");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");

        System.out.print("Enter Vendor ID : ");
        String id = sc.next();
        sc.nextLine();

        int vendor_ind = Vendor.is_user(id);
        if (vendor_ind == -1)
        {
            System.out.println("The vendor doesn't exist!");
        }
        else
        {
            Vendor.status.set(vendor_ind, -1);
            System.out.println("The vendor with Vendor ID " + id + " is disabled.");
        }
        System.out.print("Press Enter to Continue....");
        sc.nextLine();
    }

    protected void approveVendor() {
        System.out.println ( "--------------------------------------------------" );
        System.out.println ( "--------------------------------------------------" );
        System.out.println ( "        Approve/Disprove Vendor    " );
        System.out.println ( "--------------------------------------------------" );
        System.out.println ( "--------------------------------------------------" );
        try {
            for (int i = 0; i < Vendor.user_nos; i++) {
                if (Vendor.status.get ( i ) == 0) {
                    String id = user_ids.get ( i );

                    System.out.println ( "Vendor Id : " + id );
                    System.out.print ( "1 - Accept, 2 - Reject,3 - Skip,4- Back\nChoice : " );
                    int com = sc.nextInt ( );
                    sc.nextLine ( );

                    if (com == 1) {
                        Vendor.status.set ( i, 1 );
                        System.out.println ( "The Vendor " + id + " is accepted." );
                    } else if (com == 2) {
                        Vendor.status.set ( i, -1 );
                        System.out.println ( "The Vendor " + id + " is rejected!." );
                    } else if (com == 3) {
                        System.out.println ( "The Vendor '" + id + "' is skipped!." );
                    } else {
                        break;
                    }
                    System.out.print ( "Press Enter to Continue" );
                    sc.nextLine ( );
                }
            }
        }catch(Exception e){
        }
    }
}
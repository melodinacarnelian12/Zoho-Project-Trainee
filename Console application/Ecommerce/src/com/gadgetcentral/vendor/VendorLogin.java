package com.gadgetcentral.vendor;
import java.util.*;
import static com.gadgetcentral.vendor.Vendor.*;

public class VendorLogin {
    Scanner sc = new Scanner(System.in);
    protected void vendor_login(){
        int tries = 0;
        while(tries++ < 3){
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("          Welcome Vendor     ");
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("Please Enter Login Credentials");
            System.out.print("Please Enter your User Id : ");
            String user_id = sc.next();sc.nextLine();
            if(is_user(user_id) != -1){
                Vendor cu = new Vendor(user_id);
                System.out.print("Please Enter your Password : ");
                int pin = sc.nextInt();sc.nextLine();

                if(cu.is_user(pin)){
                    cu.vendor_access();
                    break;
                }else{
                    System.out.println("Entered Password is wrong. Please Try Again.");
                }
            }else{
                System.out.println("User Not Found. Please Try Again.");
            }
            if(tries == 3){
                System.out.println("Maximum Attempts Exceeded, Please Try after some time.");
            }
            System.out.print("Press Enter to continue...");
            sc.nextLine();
        }

    }
}

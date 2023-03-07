package com.gadgetcentral.vendor;
import java.util.*;

public class VendorMain {
    Scanner sc=new Scanner(System.in);
    public void vendor_welcome(){
        int opt;
        loop :while(true){

            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("         Welcome Vendor    ");
            System.out.println("---------------------------------------------------");
            System.out.println("---------------------------------------------------");
            System.out.println("Please Select the appropriate option.");
            System.out.println("1 - Already Having an Account at GadgetCentral\n2 - New to GadgetCentral\n3 - Back");

            System.out.print("Choice : ");
            opt = sc.nextInt(); sc.nextLine();

            switch(opt){
                case 1:
                    VendorLogin vendorLogin=new VendorLogin ();
                    vendorLogin.vendor_login();
                    break;
                case 2:
                    VendorRegistration vendorRegistration=new VendorRegistration ();
                    vendorRegistration.vendor_reg();
                    break;
                case 3:
                   break loop;
                default:
                    System.out.println("Please Enter a valid input!");
            }
        }
    }
}

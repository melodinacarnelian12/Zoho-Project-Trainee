package com.gadgetcentral.vendor;
import java.util.*;

public class Vendor {
    static Scanner sc = new Scanner(System.in);
        public static int user_nos = 1;
        public static ArrayList<String> user_names = new ArrayList<>() {{
            add("melo");
        }};
        public static ArrayList<String> user_ids = new ArrayList<>() {{
            add("GC101");
        }};
        public static ArrayList<Integer> pins = new ArrayList<>() {{
            add(1000);
        }};
        public static ArrayList<Integer> status = new ArrayList<>() {{
            add(0);
        }};

        String user_id ;
         public static  int usr_index;


    public static void enter_wait(){
        System.out.print("Press Enter to Exit...");
        sc.nextLine();
    }

    public Vendor(String user_id) {
        this.user_id = user_id;
        usr_index = user_ids.indexOf(user_id);
    }


    public static int is_user(String user_id){
        return user_ids.indexOf(user_id);
    }


    public boolean is_user(int pincode){
        return pins.get(usr_index) == pincode;
    }

    public void vendor_access(){
        if(Vendor.status.get(usr_index) ==1){
            VendorMenu vendorMenu=new VendorMenu ();
            vendorMenu.vendor_menu();
        }else if(Vendor.status.get(usr_index) ==-1){
            System.out.println("Your Account has been Blocked. Please Contact ADMIN for Queries.");
            System.out.print("Press Enter to continue...");
            sc.nextLine();
        }else{
            System.out.println("Your Account is not Approved. Please try after sometime.");
            System.out.print("Press Enter to continue...");
            sc.nextLine();
        }
    }

}

package com.gadgetcentral.admin;
import java.util.*;

public class AdminLogin {
    static  Scanner sc = new Scanner(System.in);
    private  String user_id;

    public AdminLogin(String user_id)
    {
        this.user_id = user_id;
    }

    public static void admin_login()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("                Welcome Admin                           ");
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please Enter Login Credentials");
        System.out.print("User Id : ");
        String user_id = sc.next();
        sc.nextLine();
        System.out.print("Password : ");
        String pass = sc.next();
        sc.nextLine();
        if (user_id.trim().equalsIgnoreCase( "admin" ) && pass.equals("0000"))
        {
            AdminMenu adminMenu = new AdminMenu();
            adminMenu.adminMenu();
        }
        else
        {
            System.out.println("The Entered Credentials are wrong");
            System.out.print("Press Enter to Continue...");
            sc.nextLine();
        }
    }
}

package com.gadgetcentral.admin;

import java.util.Scanner;

public class AdminMenu {
    protected void adminMenu()
    {
        Scanner sc = new Scanner(System.in);
        AdminService adminImplementation=new AdminService ();
        int com;
        loop:while (true)
        {

            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("         Welcome Admin    ");
            System.out.println("--------------------------------------------------");
            System.out.println("--------------------------------------------------");
            System.out.println("Select Appropriate Option\n1 - Add Vendor\n2 - Block Vendor\n3 - Approve Vendor\n4 - Exit");

            System.out.print("Choice : ");
            com = sc.nextInt();
            sc.nextLine();

            switch (com)
            {
                case 1:
                    adminImplementation.addVendor();
                    break;
                case 2:
                    adminImplementation.blockVendor();
                    break;
                case 3:
                    adminImplementation.approveVendor();
                    break;
                case 4:
                    break loop;
                default:
                    System.out.println("Please Select Appropriate Option");
            }
        }

    }
}

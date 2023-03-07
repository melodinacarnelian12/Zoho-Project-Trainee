package com.gadgetcentral.vendor;
import com.gadgetcentral.product.VendorProductManagement;

import static com.gadgetcentral.vendor.Vendor.*;

public class VendorMenu
{
    private static int usr_index;
    VendorProductManagement vendorProductManagement =new VendorProductManagement ();
    protected  void vendor_menu()
    {
        int com ;
         loop:while(true)
         {

             System.out.println("--------------------------------------------");
             System.out.println("--------------------------------------------");
             System.out.println("         Welcome , " + user_names.get(usr_index));
             System.out.println("--------------------------------------------");
             System.out.println("--------------------------------------------");
             System.out.println("Please Select the appropriate option.\n1 - Add Product\n2 - Manage Products\n3 - Exit");

            System.out.print("Choice : ");
            com = sc.nextInt();sc.nextLine();

            switch(com)
            {
                case 1:
                    vendorProductManagement.add_product();
                    break;
                case 2:

                    vendorProductManagement.manage_product();
                    break;
                case 3:
                    break loop;
                default:
                    System.out.println("Please Enter a valid input!");
            }
        }
    }
}

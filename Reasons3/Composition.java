//Composition Example in java 
//Its a realtionship of "HAS-A"that is Zoho has a Zoho_Department inside it 
//If we delete Zoho Zoho_Department doesnt exist
//But if we delete Zoho_Department Zoho exist!
//One to one relationship
//Example code:
import java.io.*;   
import java.util.*; 

class Zoho_Department 
{   
    public String name;   
    public String address;   
    Zoho_Department(String name, String address)   
    {   
        this.name = name;   
        this.address = address;   
    }   
}   

class Zoho {   
    public List<Zoho_Department> Zoho_Departments;   
    Zoho(List<Zoho_Department> Zoho_Departments)  
    {  
        this.Zoho_Departments = Zoho_Departments;  
    }   
    
    public List<Zoho_Department> getTotalZoho_DepartmentsInZoho()   
    {   
        return Zoho_Departments;   
    }  
    
}   
class Composition_Example {   
    
    public static void main(String[] args)   
    {   
        Zoho_Department c1   
            = new Zoho_Department("Appx-CRM-Mobile", "North plaza\n");   
       Zoho_Department c2   
            = new Zoho_Department("Appx-Mail-Android", "South plaza\n");   
        Zoho_Department c3 = new Zoho_Department("Appx-Desk-Ios","West wing\n");  
        
        List<Zoho_Department> Zoho_Department = new ArrayList<Zoho_Department>();   
        Zoho_Department.add(c1);   
        Zoho_Department.add(c2);   
        Zoho_Department.add(c3);   
        Zoho zoho = new Zoho(Zoho_Department);   
        List<Zoho_Department> Zoho_Departments = zoho.getTotalZoho_DepartmentsInZoho();   
        for (Zoho_Department cg : Zoho_Departments) {   
            System.out.println("Name : " + cg.name + " and " + " Address : " + cg.address);   
        }   
    }   
}  

public class Customer {
    public int id;
    public String name;
    public String email;
    public String phone;
    
    public Customer(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
    
    public void updatePhone(String newPhone) {
        this.phone = newPhone;
    }
   
}


//Restrictions of public 

public class Customer {
    private int id;
    private String name;
    private String email;
    private String phone;
    
    public Customer(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String newEmail) {
        this.email = newEmail;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }
    
}


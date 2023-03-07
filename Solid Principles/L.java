public interface Payment {
  boolean process(double amount);
}

public class CreditCardPayment implements Payment {
  private String cardNumber;
  private String cvv;
  private String expirationDate;
  
  public boolean process(double amount) {
    // l credit card payment
  }
}

public class PayPalPayment implements Payment {
  private String email;
  private String password;
  
  public boolean process(double amount) {
    //  PayPal payment
  }
}

public class Order {
  private Payment paymentMethod;
  
  public void setPaymentMethod(Payment paymentMethod) {
    this.paymentMethod = paymentMethod;
  }
  
  public void checkout(double amount) {
    boolean isPaymentSuccessful = paymentMethod.process(amount);
    if (isPaymentSuccessful) {

    }
  }
}

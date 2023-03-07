public interface CreditCardPayment {
  public void processCreditCardPayment(double amount, String cardNumber, String expiryDate, String cvv);
}

// Payment method interface for PayPal
public interface PayPalPayment {
  public void processPayPalPayment(double amount, String email, String password);
}

// Payment method interface for gift cards
public interface GiftCardPayment {
  public void processGiftCardPayment(double amount, String code);
}

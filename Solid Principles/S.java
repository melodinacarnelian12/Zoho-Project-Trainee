public class Order {
  private List<OrderItem> items;

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public double calculateTotal() {
    double subtotal = 0.0;
    for (OrderItem item : items) {
      subtotal += item.getPrice();
    }
    double discount = calculateDiscount(subtotal);
    double tax = calculateTax(subtotal - discount);
    return (subtotal - discount) + tax;
  }

  private double calculateDiscount(double subtotal) {
  }

  private double calculateTax(double taxableAmount) {
    
  }
}

public class OrderItem {
  private String name;
  private double price;

  public double getPrice() {
    return price;
  }
}

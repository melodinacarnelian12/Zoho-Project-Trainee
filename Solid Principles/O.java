public abstract class Discount {
  public abstract double applyDiscount(double amount);
}

public class PercentDiscount extends Discount {
  private double percent;

  public PercentDiscount(double percent) {
    this.percent = percent;
  }

  @Override
  public double applyDiscount(double amount) {
    return amount * (1 - (percent / 100));
  }
}

public class FixedDiscount extends Discount {
  private double amount;

  public FixedDiscount(double amount) {
    this.amount = amount;
  }

  @Override
  public double applyDiscount(double amount) {
    return Math.max(0, amount - this.amount);
  }
}

public class Order {
  private List<OrderItem> items;
  private Discount discount;

  public void addItem(OrderItem item) {
    items.add(item);
  }

  public void setDiscount(Discount discount) {
    this.discount = discount;
  }

  public double calculateTotal() {
    double subtotal = 0.0;
    for (OrderItem item : items) {
      subtotal += item.getPrice();
    }
    double discountedTotal = (discount != null) ? discount.applyDiscount(subtotal) : subtotal;
    double tax = calculateTax(discountedTotal);
    return discountedTotal + tax;
  }

  private double calculateTax(double taxableAmount) {
    // logic to calculate tax
  }
}

public class OrderItem {
  private String name;
  private double price;

  public double getPrice() {
    return price;
  }
}

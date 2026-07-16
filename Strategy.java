//Task 4: Strategy — Discount Calculator
//An e-commerce checkout needs different discount logic depending on customer type (RegularCustomer, PremiumCustomer, NoDiscount).
//Instead of a giant if/else block inside Checkout, define a DiscountStrategy interface with applyDiscount(double price)
//Checkout should hold a reference to a strategy and call it, swappable at runtime
//Ask yourself: how does this relate to the Open/Closed principle from SOLID?
interface DiscountCalculator {
    double applyDiscount(double price);
}
class RegularCustomer implements DiscountCalculator {
    public double applyDiscount(double price) {
        return price * 0.95;
    }
}

class PremiumCustomer implements DiscountCalculator {
    public double applyDiscount(double price) {
        return price * 0.80;
    }
}
class VIPCustomer implements DiscountCalculator {
    public double applyDiscount(double price) {
        return price * 0.50;
    }
}
class NoDiscount implements DiscountCalculator {
    public double applyDiscount(double price) {
        return price;
    }
}
class Checkout {
    private DiscountCalculator discountCalculator;
    public Checkout(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }
    public void setDiscountCalculator(DiscountCalculator discountCalculator) {
        this.discountCalculator = discountCalculator;
    }
    public double calculateTotal(double basePrice) {
        return discountCalculator.applyDiscount(basePrice);
    }
}
public class Strategy {
    public static void main(String[] args) {
        double itemPrice = 10.0;
        Checkout checkout = new Checkout(new NoDiscount());
        System.out.println("No Discount Total: PKR " + checkout.calculateTotal(itemPrice));
        checkout.setDiscountCalculator(new RegularCustomer());
        System.out.println("Regular Customer Total: PKR " + checkout.calculateTotal(itemPrice));
        checkout.setDiscountCalculator(new PremiumCustomer());
        System.out.println("Premium Customer Total: PKR " + checkout.calculateTotal(itemPrice));
        checkout.setDiscountCalculator(new VIPCustomer());
        System.out.println("VIP Customer Total: PKR " + checkout.calculateTotal(itemPrice));
    }
}


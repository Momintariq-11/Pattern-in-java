//Task 5: Observer — Stock Price Alert
//Build a Stock class that notifies multiple Investor objects whenever its price changes.
//Stock maintains a list of subscribed observers
//When price updates, every subscribed Investor gets notified automatically without Stock knowing who they are specifically
//This is the backbone of most event driven systems, mention where you've seen this pattern in real apps (hint: UI listeners, pub/sub systems)
import java.util.*;
interface StockObserver {
    void update(String stockName, double price);
}
class Investor implements StockObserver {
    private String name;
    public Investor(String name) {
        this.name = name;
    }
    public void update(String stockName, double price) {
        System.out.println("Alert to " + name + ": " + stockName + " price changed to PKR " + price);
    }
}
class Stock {
    private List<StockObserver> observers = new ArrayList<>();
    private String name;
    private double price;
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
        for (StockObserver observer : observers) {
            observer.update(name, price);
        }
    }
}
public class Ob {
    public static void main(String[] args) {
        Stock appleStock = new Stock("Apple", 0.0);
        Investor investor1 = new Investor("MOMIN");
        Investor investor2 = new Investor("Zain");
        Investor investor3 = new Investor("Ali");
        appleStock.registerObserver(investor1);
        appleStock.registerObserver(investor2);
        appleStock.registerObserver(investor3);
        appleStock.setPrice(15.5);
    }
}

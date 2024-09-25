/**
 * CoffeeShop class ensures only one instance of the coffee shop is created (Singleton pattern).
 * This class manages orders in the coffee shop.
 */
public class CoffeeShop {
    private static CoffeeShop instance;

    // Private constructor to restrict instantiation from outside the class
    private CoffeeShop() {
    }

    // Method to get the single instance of CoffeeShop (Singleton)
    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    // Method to place an order in the coffee shop
    public void placeOrder(Order order) {
        System.out.println("Order placed: " + order);
    }
}

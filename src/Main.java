/**
 * Main class demonstrating the use of creational design patterns in a coffee shop simulation.
 */
public class Main {
    public static void main(String[] args) {
        // Singleton pattern: Only one instance of CoffeeShop is created
        CoffeeShop shop = CoffeeShop.getInstance();

        // Factory Method pattern: Creating different types of coffee
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.prepare();

        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee cappuccino = cappuccinoFactory.createCoffee();
        cappuccino.prepare();

        // Abstract Factory pattern: Creating ingredients for a latte
        CoffeeIngredientFactory ingredientFactory = new LatteIngredientFactory();
        Milk milk = ingredientFactory.createMilk();
        Syrup syrup = ingredientFactory.createSyrup();
        milk.addMilk();
        syrup.addSyrup();

        // Prototype pattern: Cloning an order
        Order order1 = new Order("Cappuccino", "Large");
        Order order2 = order1.clone();
        System.out.println("Cloned order: " + order2);

        // Builder pattern: Building a custom coffee order
        CoffeeOrder customCoffee = new CoffeeOrder.Builder()
                .setType("Latte")
                .setMilk("Soy Milk")
                .setSyrup("Vanilla")
                .setSize("Medium")
                .build();
        System.out.println(customCoffee);

        // Placing orders in the coffee shop
        shop.placeOrder(order1);
    }
}

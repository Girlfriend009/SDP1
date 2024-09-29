/**
 * Main, демонстрирующий использование порождающих паттернов в симуляции кофейни.
 */
public class Main {
    public static void main(String[] args) {
        // Паттерн Singleton: создаем единственный экземпляр CoffeeShop
        CoffeeShop shop = CoffeeShop.getInstance();

        // Паттерн Factory Method: создаем разные типы кофе
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.prepare();

        CoffeeFactory cappuccinoFactory = new CappuccinoFactory();
        Coffee cappuccino = cappuccinoFactory.createCoffee();
        cappuccino.prepare();

        // Паттерн Abstract Factory: создаем ингредиенты для латте
        CoffeeIngredientFactory ingredientFactory = new LatteIngredientFactory();
        Milk milk = ingredientFactory.createMilk();
        Syrup syrup = ingredientFactory.createSyrup();
        milk.addMilk();
        syrup.addSyrup();

        // Паттерн Prototype: клонируем заказ
        Order order1 = new Order("Капучино", "Большой");
        Order order2 = order1.clone();
        System.out.println("Клонированный заказ: " + order2);

        // Паттерн Builder: создаем кастомный заказ на кофе
        CoffeeOrder customCoffee = new CoffeeOrder.Builder()
                .setType("Латте")
                .setMilk("Соевое молоко")
                .setSyrup("Ванильный сироп")
                .setSize("Средний")
                .build();
        System.out.println(customCoffee);

        // Оформляем заказы в кофейне
        shop.placeOrder(order1);
    }
}

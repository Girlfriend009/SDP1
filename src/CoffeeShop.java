/**
 * Класс CoffeeShop гарантирует создание только одного экземпляра кофейни (паттерн Singleton).
 * Этот класс управляет заказами в кофейне.
 */
public class CoffeeShop {
    private static CoffeeShop instance;

    // Приватный конструктор, чтобы предотвратить создание новых объектов вне класса
    private CoffeeShop() {
    }

    // Метод для получения единственного экземпляра CoffeeShop (Singleton)
    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    // Метод для оформления заказа в кофейне
    public void placeOrder(Order order) {
        System.out.println("Заказ принят: " + order);
    }
}

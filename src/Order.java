/**
 * Класс Order реализует интерфейс Cloneable, чтобы можно было копировать заказы (паттерн Прототип).
 */
class Order implements Cloneable {
    private String coffeeType;
    private String size;

    public Order(String coffeeType, String size) {
        this.coffeeType = coffeeType;
        this.size = size;
    }

    // Переопределяем метод clone() для поддержки клонирования заказов
    @Override
    public Order clone() {
        try {
            return (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Ошибка при клонировании заказа.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Заказ{" + "тип кофе='" + coffeeType + '\'' + ", размер='" + size + '\'' + '}';
    }
}

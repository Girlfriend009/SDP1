/**
 * Базовый класс Coffee, представляющий общий вид кофе.
 */
abstract class Coffee {
    public abstract void prepare();
}

/**
 * Класс Espresso, представляющий конкретный вид кофе — эспрессо.
 */
class Espresso extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Готовим эспрессо.");
    }
}

/**
 * Класс Cappuccino, представляющий конкретный вид кофе — капучино.
 */
class Cappuccino extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Готовим капучино.");
    }
}

/**
 * Абстрактный класс CoffeeFactory, определяющий метод для создания кофе.
 */
abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}

/**
 * Класс EspressoFactory для создания объектов эспрессо.
 */
class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

/**
 * Класс CappuccinoFactory для создания объектов капучино.
 */
class CappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}

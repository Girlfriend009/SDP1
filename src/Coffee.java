/**
 * Base Coffee class that provides the basic structure for different types of coffee.
 */
abstract class Coffee {
    public abstract void prepare();
}

/**
 * Espresso class that extends Coffee and implements specific preparation.
 */
class Espresso extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing an espresso.");
    }
}

/**
 * Cappuccino class that extends Coffee and implements specific preparation.
 */
class Cappuccino extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing a cappuccino.");
    }
}

/**
 * Abstract CoffeeFactory that defines a method for creating coffee.
 */
abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}

/**
 * EspressoFactory creates instances of Espresso coffee.
 */
class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Espresso();
    }
}

/**
 * CappuccinoFactory creates instances of Cappuccino coffee.
 */
class CappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}

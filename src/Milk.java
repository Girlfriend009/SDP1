/**
 * Milk interface defines a method for adding milk to coffee.
 */
interface Milk {
    void addMilk();
}

/**
 * SoyMilk class that adds soy milk to coffee.
 */
class SoyMilk implements Milk {
    @Override
    public void addMilk() {
        System.out.println("Adding soy milk.");
    }
}

/**
 * RegularMilk class that adds regular milk to coffee.
 */
class RegularMilk implements Milk {
    @Override
    public void addMilk() {
        System.out.println("Adding regular milk.");
    }
}

/**
 * Syrup interface defines a method for adding syrup to coffee.
 */
interface Syrup {
    void addSyrup();
}

/**
 * VanillaSyrup class that adds vanilla syrup to coffee.
 */
class VanillaSyrup implements Syrup {
    @Override
    public void addSyrup() {
        System.out.println("Adding vanilla syrup.");
    }
}

/**
 * Abstract CoffeeIngredientFactory defines methods for creating milk and syrup.
 */
interface CoffeeIngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}

/**
 * LatteIngredientFactory creates specific milk and syrup for latte.
 */
class LatteIngredientFactory implements CoffeeIngredientFactory {
    @Override
    public Milk createMilk() {
        return new RegularMilk();
    }

    @Override
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}

/**
 * Интерфейс Milk определяет метод для добавления молока в кофе.
 */
interface Milk {
    void addMilk();
}

/**
 * Класс SoyMilk для добавления соевого молока в кофе.
 */
class SoyMilk implements Milk {
    @Override
    public void addMilk() {
        System.out.println("Добавляем соевое молоко.");
    }
}

/**
 * Класс RegularMilk для добавления обычного молока в кофе.
 */
class RegularMilk implements Milk {
    @Override
    public void addMilk() {
        System.out.println("Добавляем обычное молоко.");
    }
}

/**
 * Интерфейс Syrup определяет метод для добавления сиропа в кофе.
 */
interface Syrup {
    void addSyrup();
}

/**
 * Класс VanillaSyrup для добавления ванильного сиропа в кофе.
 */
class VanillaSyrup implements Syrup {
    @Override
    public void addSyrup() {
        System.out.println("Добавляем ванильный сироп.");
    }
}

/**
 * Абстрактный интерфейс CoffeeIngredientFactory для создания молока и сиропа.
 */
interface CoffeeIngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}

/**
 * Класс LatteIngredientFactory создает молоко и сироп для латте.
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

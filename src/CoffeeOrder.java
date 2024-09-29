/**
 * Класс CoffeeOrder позволяет пошагово создавать кастомные заказы на кофе (паттерн Строитель).
 */
class CoffeeOrder {
    private String type;
    private String milk;
    private String syrup;
    private String size;

    private CoffeeOrder(Builder builder) {
        this.type = builder.type;
        this.milk = builder.milk;
        this.syrup = builder.syrup;
        this.size = builder.size;
    }

    // Вложенный класс Builder для создания объекта CoffeeOrder
    public static class Builder {
        private String type;
        private String milk;
        private String syrup;
        private String size;

        // Метод для задания типа кофе
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        // Метод для задания типа молока
        public Builder setMilk(String milk) {
            this.milk = milk;
            return this;
        }

        // Метод для задания типа сиропа
        public Builder setSyrup(String syrup) {
            this.syrup = syrup;
            return this;
        }

        // Метод для задания размера кофе
        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        // Метод для создания объекта CoffeeOrder
        public CoffeeOrder build() {
            return new CoffeeOrder(this);
        }
    }

    @Override
    public String toString() {
        return "Заказ на кофе{" + "тип='" + type + '\'' + ", молоко='" + milk + '\'' + ", сироп='" + syrup + '\'' + ", размер='" + size + '\'' + '}';
    }
}

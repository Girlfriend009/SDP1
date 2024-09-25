/**
 * CoffeeOrder class allows step-by-step construction of custom coffee using the Builder pattern.
 */
class CoffeeOrder {
    private final String type;
    private final String milk;
    private final String syrup;
    private final String size;

    private CoffeeOrder(Builder builder) {
        this.type = builder.type;
        this.milk = builder.milk;
        this.syrup = builder.syrup;
        this.size = builder.size;
    }

    // Builder class to construct CoffeeOrder objects
    public static class Builder {
        private String type;
        private String milk;
        private String syrup;
        private String size;

        // Setting the coffee type
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        // Setting the milk type
        public Builder setMilk(String milk) {
            this.milk = milk;
            return this;
        }

        // Setting the syrup type
        public Builder setSyrup(String syrup) {
            this.syrup = syrup;
            return this;
        }

        // Setting the size of the coffee
        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        // Final build method to return the constructed CoffeeOrder object
        public CoffeeOrder build() {
            return new CoffeeOrder(this);
        }
    }

    @Override
    public String toString() {
        return "CoffeeOrder{" + "type='" + type + '\'' + ", milk='" + milk + '\'' + ", syrup='" + syrup + '\'' + ", size='" + size + '\'' + '}';
    }
}

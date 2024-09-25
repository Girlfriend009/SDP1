/**
 * Order class that implements Cloneable to allow order duplication (Prototype pattern).
 */
class Order implements Cloneable {
    private final String coffeeType;
    private final String size;

    public Order(String coffeeType, String size) {
        this.coffeeType = coffeeType;
        this.size = size;
    }

    // Overriding clone() to support copying orders
    @Override
    public Order clone() {
        try {
            return (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning not supported for this object.");
            return null;
        }
    }

    @Override
    public String toString() {
        return "Order{" + "coffeeType='" + coffeeType + '\'' + ", size='" + size + '\'' + '}';
    }
}

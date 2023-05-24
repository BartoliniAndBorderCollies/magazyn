package magazyn;

public class Product {

    private String name;
    private int value;
    private String measureUnit;

    public Product(String name, int value, String measureUnit) {
        this.name = name;
        this.value = value;
        this.measureUnit = measureUnit;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product name: " + name + ", " +
                "value: " + value + " PLN " + ", " +
                "measure unit: " + measureUnit;
    }
}

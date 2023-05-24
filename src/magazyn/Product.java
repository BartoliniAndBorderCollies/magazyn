package magazyn;

public class Product {

    private String name;
    private int value;
    private int measureUnit;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", measureUnit=" + measureUnit +
                '}';
    }
}

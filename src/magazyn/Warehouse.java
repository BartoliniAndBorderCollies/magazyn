package magazyn;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private List<Product> products;

    public Warehouse(List<Product> products) {
        this.products = new ArrayList<>();

    }

    public void addProduct(Product product, int quantity) {
        for(int i =0; i<quantity; i++) {
         products.add(product);
         i++;
        }
    }

    public void removeProduct(String name, int quantityToRemove) {
        for(int i =0; i<quantityToRemove; i++) {
            products.remove(name);
            i++;
        }

    }

    public void displayProducts() {
        System.out.println(products);
    }

    
}

package magazyn;

import java.util.List;

public class Warehouse {

    private List<Product> products;

    public Warehouse(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product, int quantity) {
        for(int i =0; i<quantity; i++) {
         products.add(product);
        }
    }

    public Product findProduct(String name) {
        Product product = null;
        for(int i =0; i<products.size(); i++) {
            if(name.equals(products.get(i).getName())) {
                product = products.get(i);
            }
        }
        return product;
    }

    public void removeProduct(String name, int quantityToRemove) {
        if(findProduct(name) == null) {
            System.out.println("No such product in the warehouse.");
            return;
        }

        for(int i =0; i<quantityToRemove; i++){
            products.remove(findProduct(name));
        }
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }



    
}

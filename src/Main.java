import magazyn.Product;
import magazyn.Warehouse;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse(new ArrayList<>());
        Product mleko = new Product("Łaciate", 3, "litr");


        warehouse.addProduct(mleko, 10);
        warehouse.displayProducts();
        System.out.println("----------------------------------------------------------");
        warehouse.removeProduct("Łaciate", 3);
        warehouse.displayProducts();
        System.out.println("--------------------------------");
        warehouse.removeProduct("Bounty", 1);


    }
}
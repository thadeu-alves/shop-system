package products;

import java.util.ArrayList;

public class Manager {
    ArrayList<Product> allProducts = new ArrayList<Product>();

    {
        allProducts.add(new Product("arroz", 100, 0));
        allProducts.add(new Product("feijao", 100, 1));
        allProducts.add(new Product("macarrao", 100, 2));
        allProducts.add(new Product("batata", 100, 3));
    }

    public void showProducts(){
        for (Product product : allProducts){
            System.out.println("name: " + product.name + " id: " + product.id);
        }
    }

    public void addProduct(String name, double value, int id){
        for (Product product : allProducts){
            if(product.id == id){
                System.out.println("Error");
                return;
            }
        }

        allProducts.add(new Product(name, value, allProducts.size()));
    }
}

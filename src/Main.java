import java.util.ArrayList;
import java.util.Scanner;

import products.Manager;
import products.Product;

public class Main {
    static void showCart(ArrayList<Product> cart){
        for(Product product : cart){
            System.out.println("Name: " + product.name);
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        ArrayList<Product> cart = new ArrayList<Product>();

        int prod;
        Scanner scn = new Scanner(System.in);

        while (true){
            System.out.println("All products: ");
            manager.showProducts();
            System.out.println();
            System.out.println("My cart: ");
            showCart(cart);

            System.out.print("Add: ");
            prod = Integer.parseInt(scn.nextLine());
            Product product = manager.findProduct(prod);
            if(product != null){
                cart.add(product);
                System.out.println("-----------------");
            }else{
                System.out.println("!!!!!Don't finded!!!!!");
            }
        }
    }
}
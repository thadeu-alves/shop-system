import java.util.Scanner;

import products.Manager;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        String name;
        Scanner scn = new Scanner(System.in);
        while (true){
            manager.showProducts();

            System.out.print("Name: ");

            name = scn.nextLine();
            manager.addProduct(name, 100, 99);
        }
    }
}
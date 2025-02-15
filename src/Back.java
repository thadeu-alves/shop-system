import products.Manager;

import java.util.Scanner;

public class Back {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scn = new Scanner(System.in);

        while (true){
            System.out.println("All products");
            manager.showProducts();
            System.out.println();

            String name = scn.nextLine();
            double value = Double.parseDouble(scn.nextLine());
            int id = Integer.parseInt(scn.nextLine());

            manager.addProduct(name, value, id);
        }
    }
}

import products.Manager;

import java.util.Scanner;

public class Back {
    static void addNew(Manager manager, Scanner scn){
        System.out.println("Adding new");

        System.out.println("All products");
        manager.showProducts();
        System.out.println();

        System.out.print("Name: ");
        String name = scn.nextLine();
        System.out.println();

        System.out.print("Value: ");
        double value = Double.parseDouble(scn.nextLine());
        System.out.println();

        manager.addProduct(name, value);
    }

    static void editOne(Manager manager, Scanner scn){
        System.out.println("Edition");

        System.out.println("All products");
        manager.showProducts();
        System.out.println();

        System.out.print("Id: ");
        int id = Integer.parseInt(scn.nextLine());
        System.out.println();

        System.out.print("Name: ");
        String name = scn.nextLine();
        System.out.println();

        System.out.print("Value: ");
        double value = Double.parseDouble(scn.nextLine());
        System.out.println();

        manager.editProduct(id, name, value);
    }


    public static void main(String[] args){
        Manager manager = new Manager();
        Scanner scn = new Scanner(System.in);

        int op = 0;

        while (op!=-1){
            System.out.println("----------------------------------------------------------------");
            System.out.println("[0] - Just show | [1] - Add new | [2] - Edit one | [-1] - Exit");

            System.out.print("Option: ");
            op = Integer.parseInt(scn.nextLine());
            System.out.println();

            switch (op){
                case 0:
                    manager.showProducts();
                    break;
                case 1:
                    addNew(manager, scn);
                    break;
                case 2:
                    editOne(manager, scn);
                    break;
            }

        }
    }
}

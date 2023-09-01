package week5.exercises.inventory;

import java.util.Scanner;

public class InventoryManagement {
    Scanner scan = new Scanner(System.in);
    Inventory inv = new Inventory();

    public static void main(String[] args) {
        InventoryManagement inventoryManagement = new InventoryManagement();
        inventoryManagement.init();
    }

    public void init() {
        showMenu();
        chooseOption();

    }

    public void showMenu() {
        System.out.println("Store Inventory System");
        System.out.println("--------------------------------");
        System.out.println("1. Add Item");
        System.out.println("2. Check Quantity");
        System.out.println("3. Remove Item");
        System.out.println("4. List Inventory");
        System.out.println("5. Exit");
    }

    public void addItem() {

        System.out.print("Enter item name : ");
        String itemName = scan.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();
        inv.addItem(itemName, quantity);
    }

    public void chooseOption() {
        int option = 0;
        while (option != 5) {

            System.out.print("Enter your choice : ");
            option = scan.nextInt();
            scan.nextLine();
            switch (option) {
                case 1 -> addItem();

                case 2 -> {
                    System.out.print("Enter item name : ");
                    String item = scan.nextLine();
                    inv.checkQuantity(item);
                }

                case 3 -> {
                    System.out.print("Enter item name : ");
                    String item = scan.nextLine();
                    inv.removeItem(item);
                }

                case 4 -> inv.displayInventory();

                case 5 -> System.out.println("Bye");

            }
        }

    }
}

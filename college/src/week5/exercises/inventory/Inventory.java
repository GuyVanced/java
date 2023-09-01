package week5.exercises.inventory;

import java.util.HashMap;

public class Inventory {
    HashMap<String , Integer> inventory = new HashMap<String, Integer>();

    public void addItem(String itemName, int quantity){

        inventory.put(itemName, quantity);
        System.out.println("Item '" + itemName + "' added to inventory.");

    }
    public void checkQuantity(String itemName){
        if(inventory.containsKey(itemName)){
            System.out.println("Quantity of '" + itemName + "' in inventory : " + inventory.get(itemName));
        }
        else{
            System.out.println("Item '" + itemName + "' not found in inventory");
        }
    }
    public void removeItem(String itemName){
        if(inventory.containsKey(itemName)){
            inventory.remove(itemName);
            System.out.println("Item '" + itemName + "' removed from inventory.");
        }
        else{
            System.out.println("Item '" + itemName + "' not found in inventory");
        }
    }
    public void displayInventory(){
        System.out.println("INVENTORY : ");
        for(String item : inventory.keySet()){
            System.out.println("- " + item + ": " + inventory.get(item));
        }
    }
}

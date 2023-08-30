package week5.exercises.shoppingCart;

import java.util.HashSet;

public class Cart {

    HashSet<String> items = new HashSet<String>();
    public void init(){

    }

    public void addItem(String itemName){
        if(items.contains(itemName)){
            System.out.println(itemName + " already in the cart");
        }else {
            items.add(itemName);
            System.out.println(itemName + " has been added to your cart");
        }
    }

    public void displayCart(){
        int itemNumber = 1;
        for(String item : items) {
            System.out.println(itemNumber + ". " + item);
            itemNumber++;
        }
    }
}


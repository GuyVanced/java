package week5.exercises.shoppingCart;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class OnlineShopping {
    HashMap<Integer,String> items = new HashMap<Integer, String>();
    Scanner scan = new Scanner(System.in);
    Cart cart = new Cart();

    public static void main(String[] args) {

        OnlineShopping onlineShopping = new OnlineShopping();
        onlineShopping.items.put(1, "T-Shirt");
        onlineShopping.items.put(2, "Jeans");
        onlineShopping.items.put(3, "Sneakers");
        onlineShopping.items.put(4, "Backpack");
        onlineShopping.items.put(5, "Hat");
        onlineShopping.showMenu();

    }
    public void displayItems(){
        System.out.println("Available Items:");

        for(int itemNo : items.keySet()){
            System.out.println(itemNo + ". " + items.get(itemNo));
        }
        System.out.println("\n0. Back ");
        int itemNo =0;
         do {
             System.out.print("Select an item to add to your cart : ");
             itemNo = scan.nextInt();
             if(itemNo== 0){
                 showMenu();
             }
             else{
                 cart.addItem(items.get(itemNo));
             }

         }while(itemNo!=0);
    }

    public void showMenu(){
        int option;
        System.out.println("----- Welcome to Online Shopping! -----\n");
        System.out.println("1. Display Available Items ");
        System.out.println("2. Display Cart");
        System.out.println("3. Exit");
        System.out.print("Choose an option : ");
        option = scan.nextInt();

        switch(option){
            case 1 :
                displayItems();
                break;
            case 2 :
                cart.displayCart();
                break;
            case 3:
                System.out.println("Thank you for shopping with us");
                break;
        }
    }

}

package week4;

import java.util.*;

public class collections {
    public static void main(String[] args) {
//        String[] cars = new String[3];
//        ArrayList<String> cars1 = new ArrayList<>();
//
//        cars[0] = "Nissan";
//        String car = cars[0];
//        cars[0] = "Honda";
//        int length = cars.length;
        String[] names = {"Manoj", "Kushal", "dafadf","dafd"};

        for (int i = 0; i < names.length; i++) {
            if(names[i].equals("Kushal")){
                names[i] = "Kabin";
            }
        }
        for (String name: names
        ) {
            System.out.println(name);

        }
    }
}
class arrayList{
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>(2);
        cars.add("Civic");
        cars.add("Ferrari");
        System.out.println(cars);

        System.out.println(cars.get(1));

        cars.set(0, "Corolla");
        System.out.println(cars);
        cars.add(1,"car");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);

    }

}

class LinkedLists{
    public static void main(String[] args) {

//        LinkedList<String> food = new LinkedList<>();
//        food.add("Orange");
//        food.add("Apple");
//        food.add("Grape");
//        System.out.println(food);
//        food.addLast("Banana");
//        food.addFirst(("Mango"));
//        System.out.println(food);
//        food.getFirst();
//        food.getLast();
//        food.get(2);
//        food.removeFirst();
//        food.removeLast();
//        food.contains("Mango1");
//        food.indexOf("Banana");
//        food.peek();
//        ListIterator<String> it = food.listIterator();
//        /*while(it.hasNext()){
//            System.out.println(it.next());
//        }*/
//
//        while(it.hasPrevious()){
//            System.out.println(it.previous());
//        }
    }
    public void link(){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2,"E");
        System.out.println(ll);
        ll.remove("B");
    }
}

class Hashmap{
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        hash.put("Manoj", 19);
        hash.put("Kabin", 20);

        for(String key : hash.keySet()){
            System.out.println(key + " has " + hash.get(key) + " children");
        }

    }
}

class HashSets{
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<String>();
        hashset.add("A");
        hashset.add("B");
        hashset.add("C");
        hashset.add("C");
        System.out.println(hashset);
    }

}

class SortedMaps{
    public static void main(String[] args) {
        SortedMap<Integer, String> smp = new TreeMap<Integer, String>();
        TreeMap<Integer, String> tree = new TreeMap<Integer, String >();
        

    }





}

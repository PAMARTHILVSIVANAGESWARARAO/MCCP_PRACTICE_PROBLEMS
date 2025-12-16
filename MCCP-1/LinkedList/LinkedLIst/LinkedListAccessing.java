import java.util.*;

class LinkedListAccessing {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //for loop 
        System.out.println("1.Accessing elements using for loop:");
        for(int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }

        //for-each loop
        System.out.println("\n2.Accessing elements using for-each loop:");
        for (Integer element : list) {
            System.out.println("Element: " + element);
        }

        //using Iterator
        System.out.println("\n3.Accessing elements using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }


        //Using ListIterator
        System.out.println("\n4.Accessing elements using ListIterator:");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Element: " + listIterator.next());
        }
        
        //using lambda expression
        System.out.println("\n5.Accessing elements using lambda expression:");
        list.forEach(element -> System.out.println("Element: " + element));

    }
}
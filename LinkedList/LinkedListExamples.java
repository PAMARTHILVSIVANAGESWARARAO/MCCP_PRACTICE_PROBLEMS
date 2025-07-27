import java.util.LinkedList;
import java.util.ArrayList;

class LinkedListExamples {
    public static void main(String[] args) {

        // 1. LinkedList in java.util package
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        System.out.println("1. java.util.LinkedList: " + list1);

        // 2. LinkedList as Double LinkedList
        // (Internally java.util.LinkedList is already a Doubly LinkedList)
        // Example: We can add/remove from both ends:
        list1.addFirst("Start");
        list1.addLast("End");
        System.out.println("2. Doubly LinkedList: " + list1);
        list1.removeFirst();
        list1.removeLast();
        System.out.println("   After removeFirst & removeLast: " + list1);

        // 3. LinkedList as Linear Data Structure
        // Traversal (linear):
        System.out.print("3. Traversing LinkedList: ");
        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 4. LinkedList Vs ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");

        System.out.println("4. LinkedList vs ArrayList:");
        System.out.println("   LinkedList: " + list1);
        System.out.println("   ArrayList:  " + arrayList);
        System.out.println("   (LinkedList better for frequent insert/remove, ArrayList better for random access)");

        // 5. Creating LinkedList
        LinkedList<Integer> intList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            intList.add(i);
        }
        System.out.println("5. Created LinkedList<Integer>: " + intList);

        // 6. Methods to perform operations on LinkedList
        intList.addFirst(0);
        intList.addLast(6);
        System.out.println("6. After addFirst & addLast: " + intList);
        intList.removeFirst();
        intList.removeLast();
        intList.remove(2); // remove element at index 2
        System.out.println("   After removals: " + intList);
        System.out.println("   Get element at index 1: " + intList.get(1));
        System.out.println("   Contains 4? " + intList.contains(4));
        System.out.println("   Size: " + intList.size());
    }
}

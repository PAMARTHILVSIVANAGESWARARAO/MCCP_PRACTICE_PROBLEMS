import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Size of ArrayList
        System.out.print("Enter number of elements (n): ");
        int n = scanner.nextInt();

        // Input: Elements
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("\n1) Print using normal for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n\n2) Print using for-each loop:");
        for (int num : list) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n3) Print using Iterator:");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n\n4) Print using ListIterator:");
        ListIterator<Integer> listItr = list.listIterator();
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }

        System.out.println("\n\n5) Print using Enumeration:");
        Vector<Integer> vector = new Vector<>(list); // convert ArrayList to Vector
        Enumeration<Integer> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        System.out.println("\n\n6) Print using Lambda Expression:");
        list.forEach(num -> System.out.print(num + " "));

        System.out.println("\n\n7) Remove all even numbers:");
        System.out.println("Before removal: " + list);
        list.removeIf(num -> num % 2 == 0);
        System.out.println("After removal (only odd numbers): " + list);

        System.out.println("\n8) Count occurrences of element 'x':");
        System.out.print("Enter element to check (x): ");
        int x = scanner.nextInt();
        int count = 0;
        for (int num : list) {
            if (num == x) count++;
        }
        System.out.println("Element " + x + " appears " + count + " times.");

        scanner.close();
    }
}

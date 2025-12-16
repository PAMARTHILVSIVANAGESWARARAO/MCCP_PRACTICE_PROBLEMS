import java.util.*;

public class QueueTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        System.out.println("\nTraversal using Iterator:");
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nTraversal using ListIterator (forward):");
        ListIterator<Integer> listIt = ((LinkedList<Integer>) queue).listIterator();
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }

        System.out.println("\nTraversal using for-each loop:");
        for (int num : queue) {
            System.out.print(num + " ");
        }

        System.out.println("\nTraversal using lambda expression:");
        queue.forEach(num -> System.out.print(num + " "));

        sc.close();
    }
}

import java.util.*;

public class StackTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("\nTraversal using Iterator:");
        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nTraversal using ListIterator (forward):");
        ListIterator<Integer> listIt = stack.listIterator();
        while (listIt.hasNext()) {
            System.out.print(listIt.next() + " ");
        }

        System.out.println("\nTraversal using for-each loop:");
        for (int num : stack) {
            System.out.print(num + " ");
        }

        System.out.println("\nTraversal using lambda expression:");
        stack.forEach(num -> System.out.print(num + " "));

        sc.close();
    }
}

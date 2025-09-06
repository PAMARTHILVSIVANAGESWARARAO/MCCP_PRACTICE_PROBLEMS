import java.util.*;

public class HeapSortMax {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 9};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) maxHeap.add(num);
        Stack<Integer> stack = new Stack<>();
        while (!maxHeap.isEmpty()) stack.push(maxHeap.poll());
        while (!stack.isEmpty()) System.out.print(stack.pop() + " ");
    }
}

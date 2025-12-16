import java.util.*;

public class HeapSortMin {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 9};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : arr) minHeap.add(num);
        while (!minHeap.isEmpty()) System.out.print(minHeap.poll() + " ");
    }
}

import java.util.PriorityQueue;

class Problem20 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 1, 2};
        int k = 3;
        System.out.println("Problem20: Max element using Sliding Window + Max Heap");
        for (int i = 0; i <= arr.length - k; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
            for (int j = i; j < i + k; j++) pq.add(arr[j]);
            System.out.print(pq.peek() + " ");
        }
    }
}

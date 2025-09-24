import java.util.*;

public class TopKFrequent {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Count frequencies
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use min-heap to keep top k frequent elements
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> a.getValue() - b.getValue()  // min-heap based on frequency
        );

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll();  // remove the least frequent
            }
        }

        // Step 3: Extract the elements from the heap
        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll().getKey());
        }

        // Since it's a min-heap, the order might not be sorted, but for top k, we can return as is or sort if needed
        // But typically, we return in any order
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        List<Integer> result = topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + result);

        sc.close();
    }
}

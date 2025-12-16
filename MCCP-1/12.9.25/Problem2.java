import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Problem2 {
    // Method 1: Using HashMap
    public static int findSingleUsingHashMap(int[] arr) {
        System.out.println("Using HashMap:");
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            System.out.println("Processing " + num + ", count: " + freqMap.get(num));
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("Found single: " + entry.getKey());
                return entry.getKey();
            }
        }
        return -1; // Should not happen
    }

    // Method 2: Using HashSet
    public static int findSingleUsingHashSet(int[] arr) {
        System.out.println("Using HashSet:");
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                set.remove(num);
                System.out.println("Removed duplicate: " + num);
            } else {
                System.out.println("Added: " + num);
            }
        }
        int single = set.iterator().next();
        System.out.println("Single element: " + single);
        return single;
    }

    // Method 3: Using frequency array (assuming small range, e.g., 0-100)
    public static int findSingleUsingFreqArray(int[] arr) {
        System.out.println("Using frequency array:");
        int[] freq = new int[101]; // Assuming numbers 0-100
        for (int num : arr) {
            freq[num]++;
            System.out.println("Incremented freq[" + num + "] to " + freq[num]);
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1) {
                System.out.println("Found single: " + i);
                return i;
            }
        }
        return -1;
    }

    // Method 4: Using visited and unvisited approach
    public static int findSingleUsingVisited(int[] arr) {
        System.out.println("Using visited approach:");
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !visited[j]) {
                    count++;
                    visited[j] = true;
                    System.out.println("Marked " + j + " as visited for " + arr[i]);
                }
            }
            if (count == 1) {
                System.out.println("Single element: " + arr[i]);
                return arr[i];
            }
            visited[i] = true;
        }
        return -1;
    }

    // Method 5: Using XOR operation
    public static int findSingleUsingXOR(int[] arr) {
        System.out.println("Using XOR:");
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
            System.out.println("XOR with " + num + " = " + xor);
        }
        System.out.println("Single element: " + xor);
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3};
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Result HashMap: " + findSingleUsingHashMap(arr.clone()));
        System.out.println();
        System.out.println("Result HashSet: " + findSingleUsingHashSet(arr.clone()));
        System.out.println();
        System.out.println("Result FreqArray: " + findSingleUsingFreqArray(arr.clone()));
        System.out.println();
        System.out.println("Result Visited: " + findSingleUsingVisited(arr.clone()));
        System.out.println();
        System.out.println("Result XOR: " + findSingleUsingXOR(arr.clone()));
    }
}

import java.util.*;

public class OrderedFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LinkedHashMap<Integer, Integer> freqMap = new LinkedHashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nFrequencies of elements (in input order):");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

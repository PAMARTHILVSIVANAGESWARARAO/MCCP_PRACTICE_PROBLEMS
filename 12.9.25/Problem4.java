import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    // Method 1: Using HashMap
    public static boolean verifyEvenTimesUsingHashMap(int[] arr) {
        System.out.println("Using HashMap:");
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            System.out.println("Processing " + num + ", count: " + freqMap.get(num));
        }
        boolean allEven = true;
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                allEven = false;
                System.out.println("Found odd count: " + count);
                break;
            }
        }
        System.out.println("All elements appear even times: " + allEven);
        return allEven;
    }

    // Method 2: Using XOR operation
    public static boolean verifyEvenTimesUsingXOR(int[] arr) {
        System.out.println("Using XOR:");
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
            System.out.println("XOR with " + num + " = " + xor);
        }
        boolean result = (xor == 0);
        System.out.println("XOR == 0: " + result + " (All elements appear even times)");
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4};
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Result HashMap: " + verifyEvenTimesUsingHashMap(arr.clone()));
        System.out.println();
        System.out.println("Result XOR: " + verifyEvenTimesUsingXOR(arr.clone()));
    }
}

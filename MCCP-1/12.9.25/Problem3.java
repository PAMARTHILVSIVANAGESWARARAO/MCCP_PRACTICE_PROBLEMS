import java.util.HashMap;
import java.util.Map;

public class Problem3 {
    // Method 1: Using HashMap
    public static boolean verifyExactlyTwiceUsingHashMap(int[] arr) {
        System.out.println("Using HashMap:");
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            System.out.println("Processing " + num + ", count: " + freqMap.get(num));
        }
        boolean allTwice = true;
        for (int count : freqMap.values()) {
            if (count != 2) {
                allTwice = false;
                System.out.println("Found count != 2: " + count);
                break;
            }
        }
        System.out.println("All elements appear exactly twice: " + allTwice);
        return allTwice;
    }

    // Method 2: Using XOR operation
    public static boolean verifyExactlyTwiceUsingXOR(int[] arr) {
        System.out.println("Using XOR:");
        int xor = 0;
        for (int num : arr) {
            xor ^= num;
            System.out.println("XOR with " + num + " = " + xor);
        }
        boolean result = (xor == 0);
        System.out.println("XOR == 0: " + result + " (Note: This only checks even total counts, not exactly twice each)");
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        System.out.println("Array: " + java.util.Arrays.toString(arr));
        System.out.println("Result HashMap: " + verifyExactlyTwiceUsingHashMap(arr.clone()));
        System.out.println();
        System.out.println("Result XOR: " + verifyExactlyTwiceUsingXOR(arr.clone()));
    }
}

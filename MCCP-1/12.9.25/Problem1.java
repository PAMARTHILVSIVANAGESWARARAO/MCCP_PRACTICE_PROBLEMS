import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    // Method 1: Using HashMap
    public static void frequencyUsingHashMap(String str) {
        System.out.println("Using HashMap:");
        Map<Character, Integer> freqMap = new HashMap<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
                System.out.println("Processing character '" + c + "', current count: " + freqMap.get(c));
            }
        }
        System.out.println("Final frequencies: " + freqMap);
    }

    // Method 2: Using frequency array
    public static void frequencyUsingArray(String str) {
        System.out.println("Using frequency array:");
        int[] freq = new int[26];
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                freq[index]++;
                System.out.println("Processing character '" + c + "', index " + index + ", current count: " + freq[index]);
            }
        }
        System.out.print("Final frequencies: ");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.print((char)(i + 'a') + ":" + freq[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("String: " + str);
        frequencyUsingHashMap(str);
        System.out.println();
        frequencyUsingArray(str);
    }
}

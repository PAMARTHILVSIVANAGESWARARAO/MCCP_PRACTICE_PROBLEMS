import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem5 {
    // Method 1: Using HashMap
    public static boolean isIsogramUsingHashMap(String str) {
        System.out.println("Using HashMap:");
        Map<Character, Integer> freqMap = new HashMap<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
                System.out.println("Processing '" + c + "', count: " + freqMap.get(c));
                if (freqMap.get(c) > 1) {
                    System.out.println("Not isogram: '" + c + "' repeated");
                    return false;
                }
            }
        }
        System.out.println("Is isogram: true");
        return true;
    }

    // Method 2: Using HashSet
    public static boolean isIsogramUsingHashSet(String str) {
        System.out.println("Using HashSet:");
        Set<Character> set = new HashSet<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!set.add(c)) {
                    System.out.println("Not isogram: '" + c + "' already in set");
                    return false;
                } else {
                    System.out.println("Added '" + c + "' to set");
                }
            }
        }
        System.out.println("Is isogram: true");
        return true;
    }

    // Method 3: Using frequency array
    public static boolean isIsogramUsingFreqArray(String str) {
        System.out.println("Using frequency array:");
        int[] freq = new int[26];
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                freq[index]++;
                System.out.println("Incremented freq[" + index + "] for '" + c + "' to " + freq[index]);
                if (freq[index] > 1) {
                    System.out.println("Not isogram: '" + c + "' repeated");
                    return false;
                }
            }
        }
        System.out.println("Is isogram: true");
        return true;
    }

    // Method 4: Using visited unvisited approach
    public static boolean isIsogramUsingVisited(String str) {
        System.out.println("Using visited approach:");
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        boolean[] visited = new boolean[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isLetter(chars[i]) || visited[i]) continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && !visited[j]) {
                    System.out.println("Found duplicate: '" + chars[i] + "' at " + i + " and " + j);
                    return false;
                }
            }
            visited[i] = true;
        }
        System.out.println("Is isogram: true");
        return true;
    }

    public static void main(String[] args) {
        String str = "Machine";
        System.out.println("String: " + str);
        System.out.println("Result HashMap: " + isIsogramUsingHashMap(str));
        System.out.println();
        System.out.println("Result HashSet: " + isIsogramUsingHashSet(str));
        System.out.println();
        System.out.println("Result FreqArray: " + isIsogramUsingFreqArray(str));
        System.out.println();
        System.out.println("Result Visited: " + isIsogramUsingVisited(str));
    }
}

package pangram;
import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str2 = "abcdefghijklmnopqrstuvwxyz";

        

        System.out.println("Using HashMap");
        System.out.println(str + (isPangram1(str) ? "The string is a pangram." : "The string is not a pangram.\n\n"));
        System.out.println(str2 + (isPangram1(str2) ? "The string is a pangram." : "The string is not a pangram.\n\n"));

        System.out.println("Using UserDefined HashMap (Array)");
        System.out.println(str + (isPangram2(str) ? "The string is a pangram." : "The string is not a pangram.\n\n"));
        System.out.println(str2 + (isPangram2(str2) ? "The string is a pangram." : "The string is not a pangram.\n\n"));

        System.out.println("Using HashSet");
        System.out.println(str + (isPangram3(str) ? "The string is a pangram." : "The string is not a pangram.\n\n"));
        System.out.println(str2 + (isPangram3(str2) ? "The string is a pangram." : "The string is not a pangram.\n\n"));

        System.out.println("Using Character Array from a-z");
        System.out.println(str + (isPangram4(str) ? "The string is a pangram." : "The string is not a pangram.\n\n"));
        System.out.println(str2 + (isPangram4(str2) ? "The string is a pangram." : "The string is not a pangram.\n\n"));
    }

    public static boolean isPangram1(String str) {
        if (str.length() < 26) return false;
        str = str.toLowerCase();
        HashMap<Character, Boolean> map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, false);
        }
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, true);
            }
        }
        for (boolean present : map.values()) {
            if (!present) return false;
        }
        return true;
    }

    public static boolean isPangram2(String str) {
        if (str.length() < 26) return false;
        str = str.toLowerCase();
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        for (int count : freq) {
            if (count == 0) return false;
        }
        return true;
    }

    public static boolean isPangram3(String str) {
        if (str.length() < 26) return false;
        str = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        return set.size() == 26;
    }

    public static boolean isPangram4(String str) {
        if (str.length() < 26) return false;
        str = str.toLowerCase();

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                alphabet[index] = '0'; // mark as found
            }
        }

        for (char c : alphabet) {
            if (c != '0') {
                return false;
            }
        }
        return true;
    }
}

import java.util.*;

public class RemoveDuplicateConsecutiveChars {

    // Two Pointer Method
    public static String twoPointer(String s) {
        if (s.length() == 0) return "";
        char[] arr = s.toCharArray();
        int write = 0;
        for (int read = 1; read < arr.length; read++) {
            if (arr[read] != arr[write]) {
                write++;
                arr[write] = arr[read];
            }
        }
        return new String(arr, 0, write + 1);
    }

    // Stack Method (fixed)
    public static String stack(String s) {
        if (s.length() == 0) return "";
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "AABBCCDD";

        System.out.println("input string: " + s);
        System.out.println("Using Two Pointer: " + twoPointer(s));
        System.out.println("Using Stack: " + stack(s));
    }
}

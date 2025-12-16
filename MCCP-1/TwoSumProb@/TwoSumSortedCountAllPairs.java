import java.util.*;

public class TwoSumSortedCountAllPairs {

    // Brute Force Method
    public static int bruteForce(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    // Two Pointer Method
    public static int twoPointer(int[] arr, int target) {
        int count = 0;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                count++;
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return count;
    }

    // HashMap Method
    public static int hashMap(int[] arr, int target) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count++;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // sorted
        int target = 7;

        System.out.println("Using Brute Force: " + bruteForce(arr, target));
        System.out.println("Using Two Pointer: " + twoPointer(arr, target));
        System.out.println("Using HashMap: " + hashMap(arr, target));
    }
}

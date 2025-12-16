import java.util.*;

public class TwoSumWithDuplicatesCountAllPairs {

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

    // HashMap Method
    public static int hashMap(int[] arr, int target) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int target = 4;

        System.out.println("Using Brute Force: " + bruteForce(arr, target));
        System.out.println("Using HashMap: " + hashMap(arr, target));
    }
}

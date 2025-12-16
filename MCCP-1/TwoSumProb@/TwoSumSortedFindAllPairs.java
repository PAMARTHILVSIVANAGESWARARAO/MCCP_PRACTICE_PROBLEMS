import java.util.*;

public class TwoSumSortedFindAllPairs {

    // Brute Force Method
    public static List<int[]> bruteForce(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    pairs.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return pairs;
    }

    // Two Pointer Method
    public static List<int[]> twoPointer(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                pairs.add(new int[]{arr[left], arr[right]});
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return pairs;
    }

    // HashMap Method
    public static List<int[]> hashMap(int[] arr, int target) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                pairs.add(new int[]{complement, num});
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // assumed sorted
        int target = 7;

        System.out.println("Using Brute Force: " + Arrays.deepToString(bruteForce(arr, target).toArray()));
        System.out.println("Using Two Pointer: " + Arrays.deepToString(twoPointer(arr, target).toArray()));
        System.out.println("Using HashMap: " + Arrays.deepToString(hashMap(arr, target).toArray()));
    }
}

import java.util.*;

public class FindPairIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();

        FindPairIndices obj = new FindPairIndices();

        System.out.println("Finding indices of the pair:");
        System.out.println("Using Brute Force: ");
        System.out.println(Arrays.toString(obj.BruteForce(arr, target)));

        System.out.println("Using Two Pointer: ");
        System.out.println(Arrays.toString(obj.TwoPointer(arr, target)));
        System.out.println("Using Binary Search: ");
        System.out.println(Arrays.toString(obj.BinarySearch(arr, target)));
        System.out.println("Using Hashing: ");
        System.out.println(Arrays.toString(obj.Hashing(arr, target)));
    }

    int[] BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    int[] TwoPointer(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return new int[]{left, right};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    int[] BinarySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            int idx = Arrays.binarySearch(arr, i + 1, arr.length, complement);
            if (idx >= 0) return new int[]{i, idx};
        }
        return new int[]{-1, -1};
    }

    int[] Hashing(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) return new int[]{map.get(complement), i};
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}

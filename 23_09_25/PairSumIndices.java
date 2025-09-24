import java.util.*;

public class PairSumIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        PairSumIndices obj = new PairSumIndices();

        System.out.println("Finding indices of the pair:");
        System.out.println("Using Brute Force: ");
        System.out.println(Arrays.toString(obj.BruteForce(arr, target)));
        System.out.println("Using Two Pointer: ");
        System.out.println(Arrays.toString(obj.SortTwoPointer(arr.clone(), target)));
        System.out.println("Using Binary Search: ");
        System.out.println(Arrays.toString(obj.SortBinarySearch(arr.clone(), target)));
        System.out.println("Using Hashing: ");
        System.out.println(Arrays.toString(obj.UsingHashing(arr, target)));
    }

    // 1. Brute Force
    int[] BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // 2. Sorting + Two Pointer
    int[] SortTwoPointer(int[] arr, int target) {
        int n = arr.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0, right = n - 1;
        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            }
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    // 3. Sorting + Binary Search
    int[] SortBinarySearch(int[] arr, int target) {
        int n = arr.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            int complement = target - pairs[i][0];
            int idx = Arrays.binarySearch(pairs, i + 1, n, new int[]{complement, 0},
                    (a, b) -> Integer.compare(a[0], b[0]));
            if (idx >= 0) {
                return new int[]{pairs[i][1], pairs[idx][1]};
            }
        }
        return new int[]{-1, -1};
    }

    // 4. Hashing
    int[] UsingHashing(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
}

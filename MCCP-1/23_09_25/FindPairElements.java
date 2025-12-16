import java.util.*;

public class FindPairElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();

        FindPairElements obj = new FindPairElements();

        System.out.println("Finding elements of the pair:");
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
                if (arr[i] + arr[j] == target) return new int[]{arr[i], arr[j]};
            }
        }
        return new int[]{-1, -1};
    }

    int[] TwoPointer(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return new int[]{arr[left], arr[right]};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{-1, -1};
    }

    int[] BinarySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            int idx = Arrays.binarySearch(arr, i + 1, arr.length, complement);
            if (idx >= 0) return new int[]{arr[i], arr[idx]};
        }
        return new int[]{-1, -1};
    }

    int[] Hashing(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) return new int[]{complement, num};
            set.add(num);
        }
        return new int[]{-1, -1};
    }
}

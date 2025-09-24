import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        PairSum obj = new PairSum();

        System.out.println("Verifying if a pair exists:");
        System.out.println("Using Brute Force: ");
        System.out.println(obj.BruteForce(arr, target));
        System.out.println("Using Two Pointer: ");
        System.out.println(obj.SortTwoPointer(arr.clone(), target));
        System.out.println("Using Binary Search: ");
        System.out.println(obj.SortBinarySearch(arr.clone(), target));
        System.out.println("Using Hashing: ");
        System.out.println(obj.UsingHashing(arr, target));
    }

    boolean BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) return true;
            }
        }
        return false;
    }

    boolean SortTwoPointer(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }

    boolean SortBinarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (Arrays.binarySearch(arr, i + 1, arr.length, complement) >= 0) {
                return true;
            }
        }
        return false;
    }

    boolean UsingHashing(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) return true;
            set.add(num);
        }
        return false;
    }
}

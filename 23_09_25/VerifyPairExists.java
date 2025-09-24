import java.util.*;

public class VerifyPairExists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();

        VerifyPairExists obj = new VerifyPairExists();

        System.out.println("Using Brute Force: ");
        System.out.println(obj.BruteForce(arr, target));
        System.out.println("Using Two Pointer: ");
        System.out.println(obj.TwoPointer(arr, target));
        System.out.println("Using Binary Search: ");
        System.out.println(obj.BinarySearch(arr, target));
        System.out.println("Using Hashing: ");
        System.out.println(obj.Hashing(arr, target));
    }

    boolean BruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) return true;
            }
        }
        return false;
    }

    boolean TwoPointer(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }
        return false;
    }

    boolean BinarySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (Arrays.binarySearch(arr, i + 1, arr.length, complement) >= 0) {
                return true;
            }
        }
        return false;
    }

    boolean Hashing(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) return true;
            set.add(num);
        }
        return false;
    }
}

import java.util.Arrays;

public class TwoSumSortedPairSortTwoPtr {
    public static int[] findPair(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2, 3};
        System.out.println("Sorting and Two Pointer Technique: " + Arrays.toString(findPair(arr)));
    }
}

import java.util.Arrays;

public class TwoSumUnsortedPairSortTwoPtr {
    public static int[] findPair(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int left = 0, right = sortedArr.length - 1;
        while (left < right) {
            int sum = sortedArr[left] + sortedArr[right];
            if (sum == 0) {
                return new int[]{sortedArr[left], sortedArr[right]};
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3};
        System.out.println("Sorting and Two Pointer Technique: " + Arrays.toString(findPair(arr)));
    }
}

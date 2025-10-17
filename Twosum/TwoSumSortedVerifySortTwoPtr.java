public class TwoSumSortedVerifySortTwoPtr {
    public static boolean hasPairSumZero(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                return true;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2, 3};
        System.out.println("Sorting and Two Pointer Technique: " + hasPairSumZero(arr));
    }
}

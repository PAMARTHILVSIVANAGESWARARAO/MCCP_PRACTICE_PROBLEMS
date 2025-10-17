import java.util.Arrays;

public class TwoSumUnsortedIndicesSortTwoPtr {
    public static int[] findPairIndices(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int left = 0, right = sortedArr.length - 1;
        while (left < right) {
            int sum = sortedArr[left] + sortedArr[right];
            if (sum == 0) {
                // Find original indices
                int index1 = -1, index2 = -1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == sortedArr[left] && index1 == -1) {
                        index1 = i;
                    } else if (arr[i] == sortedArr[right] && i != index1) {
                        index2 = i;
                    }
                }
                return new int[]{index1, index2};
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
        int[] indices = findPairIndices(arr);
        System.out.println("Sorting and Two Pointer Technique: [" + indices[0] + ", " + indices[1] + "]");
    }
}

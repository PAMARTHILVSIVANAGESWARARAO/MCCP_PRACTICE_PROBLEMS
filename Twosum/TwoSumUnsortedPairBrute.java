import java.util.Arrays;

public class TwoSumUnsortedPairBrute {
    public static int[] findPair(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3};
        System.out.println("Brute Force Technique: " + Arrays.toString(findPair(arr)));
    }
}

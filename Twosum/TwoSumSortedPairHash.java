import java.util.Arrays;
import java.util.HashSet;

public class TwoSumSortedPairHash {
    public static int[] findPair(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(-num)) {
                return new int[]{-num, num};
            }
            set.add(num);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2, 3};
        System.out.println("Hashing Technique: " + Arrays.toString(findPair(arr)));
    }
}

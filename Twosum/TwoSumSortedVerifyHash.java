import java.util.HashSet;

public class TwoSumSortedVerifyHash {
    public static boolean hasPairSumZero(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(-num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2, 3};
        System.out.println("Hashing Technique: " + hasPairSumZero(arr));
    }
}

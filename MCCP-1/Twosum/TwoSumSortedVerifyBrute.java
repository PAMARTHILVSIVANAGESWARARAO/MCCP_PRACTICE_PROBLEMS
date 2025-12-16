public class TwoSumSortedVerifyBrute {
    public static boolean hasPairSumZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2, 3};
        System.out.println("Brute Force Technique: " + hasPairSumZero(arr));
    }
}

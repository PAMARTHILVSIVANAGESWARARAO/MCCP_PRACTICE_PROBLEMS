public class TwoSumSortedIndicesBrute {
    public static int[] findPairIndices(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2, 3};
        int[] indices = findPairIndices(arr);
        System.out.println("Brute Force Technique: [" + indices[0] + ", " + indices[1] + "]");
    }
}

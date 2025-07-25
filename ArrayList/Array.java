public class Array {
    public static int firstRepeatingElement(int[] arr) {
        int max = 1000001;
        int[] idx = new int[max];
        java.util.Arrays.fill(idx, -1);
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (idx[arr[i]] != -1) {
                minIndex = Math.min(minIndex, idx[arr[i]]);
            } else {
                idx[arr[i]] = i;
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex + 1;
    }
}

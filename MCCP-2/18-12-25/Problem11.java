class Problem11 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3, sum = 0, max;
        System.out.println("Problem11: Maximum sum using Sliding Window Logic-1");
        for (int i = 0; i < k; i++) sum += arr[i];
        max = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}

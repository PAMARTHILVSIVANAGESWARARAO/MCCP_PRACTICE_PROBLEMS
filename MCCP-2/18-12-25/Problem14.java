class Problem14 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3, sum = 0, min;
        System.out.println("Problem14: Minimum sum using Sliding Window Logic-1");
        for (int i = 0; i < k; i++) sum += arr[i];
        min = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}

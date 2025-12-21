class Problem10 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int max = Integer.MIN_VALUE;
        System.out.println("Problem10: Maximum sum of sub-arrays (Brute Force)");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) sum += arr[j];
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}

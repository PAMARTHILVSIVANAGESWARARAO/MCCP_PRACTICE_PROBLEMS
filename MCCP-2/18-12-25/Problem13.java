class Problem13 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int min = Integer.MAX_VALUE;
        System.out.println("Problem13: Minimum sum of sub-arrays (Brute Force)");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) sum += arr[j];
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}

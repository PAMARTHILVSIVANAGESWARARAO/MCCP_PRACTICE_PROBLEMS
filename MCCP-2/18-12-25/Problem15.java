class Problem15 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3, i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        System.out.println("Problem15: Minimum sum using Sliding Window Logic-2");
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 == k) {
                min = Math.min(min, sum);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        System.out.println(min);
    }
}

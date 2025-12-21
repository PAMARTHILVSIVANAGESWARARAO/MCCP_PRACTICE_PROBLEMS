class Problem2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3, sum = 0;
        System.out.println("Problem2: Sum using Sliding Window Logic-1");
        for (int i = 0; i < k; i++) sum += arr[i];
        System.out.print(sum + " ");
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            System.out.print(sum + " ");
        }
    }
}

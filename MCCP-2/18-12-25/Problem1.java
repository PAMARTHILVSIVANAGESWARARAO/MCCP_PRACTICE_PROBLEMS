class Problem1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Problem1: Sum of each sub-array of size k (Brute Force)");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) sum += arr[j];
            System.out.print(sum + " ");
        }
    }
}

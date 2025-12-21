class Problem7 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("Problem7: Average of each sub-array");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) sum += arr[j];
            System.out.print((sum * 1.0 / k) + " ");
        }
    }
}

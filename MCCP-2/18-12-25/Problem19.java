class Problem19 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 1, 2};
        int k = 3;
        System.out.println("Problem19: Max element in each sub-array (Brute Force)");
        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) max = Math.max(max, arr[j]);
            System.out.print(max + " ");
        }
    }
}

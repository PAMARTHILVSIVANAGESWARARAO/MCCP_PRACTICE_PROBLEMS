class Problem9 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3, i = 0, j = 0, sum = 0;
        System.out.println("Problem9: Average using Sliding Window Logic-2");
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 == k) {
                System.out.print(sum * 1.0 / k + " ");
                sum -= arr[i];
                i++;
            }
            j++;
        }
    }
}

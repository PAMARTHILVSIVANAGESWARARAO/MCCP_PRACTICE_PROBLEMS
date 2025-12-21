import java.util.ArrayList;

class Problem16 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println("Problem16: Max and Min sum of sub-arrays");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) sum += arr[j];
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        res.add(max);
        res.add(min);
        System.out.println(res);
    }
}

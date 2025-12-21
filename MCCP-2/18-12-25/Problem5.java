import java.util.ArrayList;

class Problem5 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3, sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Problem5: Sliding Window Logic-1 (ArrayList)");
        for (int i = 0; i < k; i++) sum += arr[i];
        list.add(sum);
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            list.add(sum);
        }
        System.out.println(list);
    }
}

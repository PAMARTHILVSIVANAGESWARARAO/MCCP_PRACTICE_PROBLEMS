import java.util.ArrayList;

class Problem6 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3, i = 0, j = 0, sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Problem6: Sliding Window Logic-2 (ArrayList)");
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 == k) {
                list.add(sum);
                sum -= arr[i];
                i++;
            }
            j++;
        }
        System.out.println(list);
    }
}

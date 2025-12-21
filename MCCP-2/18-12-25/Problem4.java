import java.util.ArrayList;

class Problem4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Problem4: Sum using Brute Force (ArrayList)");
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) sum += arr[j];
            list.add(sum);
        }
        System.out.println(list);
    }
}

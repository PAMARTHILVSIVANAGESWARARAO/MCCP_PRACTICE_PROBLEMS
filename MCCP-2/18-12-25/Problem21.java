import java.util.TreeMap;

class Problem21 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 1, 1, 2};
        int k = 3;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        System.out.println("Problem21: Max element using Sliding Window + TreeMap");

        for (int i = 0; i < k; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

        System.out.print(map.lastKey() + " ");

        for (int i = k; i < arr.length; i++) {
            int out = arr[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) map.remove(out);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.print(map.lastKey() + " ");
        }
    }
}

import java.util.HashMap;

public class TwoSumUnsortedIndicesHash {
    public static int[] findPairIndices(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(-arr[i])) {
                return new int[]{map.get(-arr[i]), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3};
        int[] indices = findPairIndices(arr);
        System.out.println("Hashing Technique: [" + indices[0] + ", " + indices[1] + "]");
    }
}

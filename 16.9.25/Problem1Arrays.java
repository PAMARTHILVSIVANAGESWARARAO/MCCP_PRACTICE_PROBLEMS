
import java.util.*;

class SortComparator implements Comparator<int[]> {
    public int compare(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return a[1] - b[1]; // smaller value first if frequencies are equal
        } else {
            return b[0] - a[0]; // higher frequency first
        }
    }
}

public class Problem1Arrays {

    public static int[] SortByFreq3(int a[], int n) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(new SortComparator());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.add(new int[]{entry.getValue(), entry.getKey()});
        }

        // Calculate total size of output array
        int totalSize = 0;
        for (int[] pair : pq) {
            totalSize += pair[0];
        }

        int[] ans = new int[totalSize];
        int index = 0;

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int freq = top[0];
            int val = top[1];
            for (int i = 0; i < freq; i++) {
                ans[index++] = val;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] ans = SortByFreq3(a, n);

        System.out.print("Sorted by frequency (HashMap + PQ + arrays): ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

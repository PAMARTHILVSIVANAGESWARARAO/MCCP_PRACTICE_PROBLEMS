import java.util.*;

class Sort implements Comparator<ArrayList<Integer>> {
    public int compare(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.get(0).equals(b.get(0))) {
            return a.get(1) - b.get(1);
        } else {
            return b.get(0) - a.get(0);
        }
    }
}

public class Problem1 {

    public static ArrayList<Integer> SortByFreq1(int a[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(a[i], hm.getOrDefault(a[i], 0) + 1);
        }

        ArrayList<ArrayList<Integer>> f = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(e.getValue());
            temp.add(e.getKey());
            f.add(temp);
        }

        Collections.sort(f, new Sort());

        ArrayList<Integer> ans = new ArrayList<>();
        for (ArrayList<Integer> pair : f) {
            int count = pair.get(0);
            int val = pair.get(1);
            for (int j = 0; j < count; j++) {
                ans.add(val);
            }
        }

        return ans;
    }

    // SortByFreq2 using Max PriorityQueue without lambda
    public static ArrayList<Integer> SortByFreq2(int a[], int n) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            freqMap.put(a[i], freqMap.getOrDefault(a[i], 0) + 1);
        }

        // Max PriorityQueue of ArrayList<Integer> with [frequency, value]
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>(new Sort());
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(entry.getValue());
            temp.add(entry.getKey());
            pq.add(temp);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ArrayList<Integer> top = pq.poll();
            int freq = top.get(0);
            int val = top.get(1);
            for (int i = 0; i < freq; i++) {
                ans.add(val);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> ans1 = SortByFreq1(a, n);
        System.out.print("Sorted by frequency (SortByFreq1): ");
        for (int i : ans1) System.out.print(i + " ");

        System.out.println();

        ArrayList<Integer> ans2 = SortByFreq2(a, n);
        System.out.print("Sorted by frequency (SortByFreq2 - MaxPQ): ");
        for (int i : ans2) System.out.print(i + " ");

        sc.close();
    }
}

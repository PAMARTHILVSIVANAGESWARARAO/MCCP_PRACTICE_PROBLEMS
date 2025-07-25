// package prob;

import java.util.*;

public class AllFactors {
    public static void main(String[] args) {
        int n = 36;

        System.out.println("1. Brute force: " + getFactors1(n));
        System.out.println("2. Sqrt paired method: " + getFactors2(n));
        System.out.println("3. Sorted factors: " + getFactors3(n));
    }

    static List<Integer> getFactors1(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }
        return list;
    }

    static List<Integer> getFactors2(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        return new ArrayList<>(set);
    }

    static List<Integer> getFactors3(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) list.add(n / i);
            }
        }
        Collections.sort(list);
        return list;
    }
}

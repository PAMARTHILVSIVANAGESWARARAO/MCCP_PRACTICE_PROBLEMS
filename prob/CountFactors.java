// package prob;

public class CountFactors {
    public static void main(String[] args) {
        int n = 36;

        System.out.println("1. Brute force: " + countFactors1(n));
        System.out.println("2. Square root method: " + countFactors2(n));
        System.out.println("3. Optimized with double count: " + countFactors3(n));
    }

    static int countFactors1(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        return count;
    }

    static int countFactors2(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) count++;
                else count += 2;
            }
        }
        return count;
    }

    static int countFactors3(int n) {
        int count = 0, i = 1;
        while (i * i < n) {
            if (n % i == 0) count += 2;
            i++;
        }
        if (i * i == n) count++;
        return count;
    }
}

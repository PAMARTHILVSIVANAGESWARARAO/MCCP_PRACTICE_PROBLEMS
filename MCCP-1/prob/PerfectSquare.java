// package prob;

class PerfectSquare {
    public static void main(String[] args) {
        int n = 49;

        System.out.println("1. Math.sqrt check: " + isPerfectSquare1(n));
        System.out.println("2. Binary search method: " + isPerfectSquare2(n));
        System.out.println("3. Sum of odd numbers: " + isPerfectSquare3(n));
        System.out.println("4. Linear square check: " + isPerfectSquare4(n));
    }

    static boolean isPerfectSquare1(int n) {
        double root = Math.sqrt(n);
        return root == (int) root;
    }

    static boolean isPerfectSquare2(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long sq = (long) mid * mid;
            if (sq == n) return true;
            if (sq < n) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }

    static boolean isPerfectSquare3(int n) {
        int sum = 0, i = 1;
        while (sum < n) {
            sum += i;
            i += 2;
        }
        return sum == n;
    }

    static boolean isPerfectSquare4(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) return true;
        }
        return false;
    }
}

import java.util.*;

public class FibonacciProblems {

    // 1. nth Fibonacci number
    public static int nthFibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // 2. Display first n Fibonacci numbers
    public static void displayFirstNFib(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 3. Return first n Fibonacci numbers
    public static int[] returnFirstNFib(int n) {
        int[] arr = new int[n];
        if (n > 0) arr[0] = 0;
        if (n > 1) arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    // 4. Display Fibonacci numbers up to n
    public static void displayFibUptoN(int n) {
        int a = 0, b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 5. Return Fibonacci numbers up to n
    public static List<Integer> returnFibUptoN(int n) {
        List<Integer> list = new ArrayList<>();
        int a = 0, b = 1;
        while (a <= n) {
            list.add(a);
            int c = a + b;
            a = b;
            b = c;
        }
        return list;
    }

    // 6. Verify Fibonacci O(n)
    public static boolean isFibonacciOn(int n) {
        if (n == 0 || n == 1) return true;
        int a = 0, b = 1;
        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b == n;
    }

    // 7. Verify Fibonacci O(sqrt(n))
    public static boolean isFibonacciOsqrt(int n) {
        long x1 = 5L * n * n + 4;
        long x2 = 5L * n * n - 4;
        return isPerfectSquare(x1) || isPerfectSquare(x2);
    }

    private static boolean isPerfectSquare(long x) {
        long s = (long) Math.sqrt(x);
        return s * s == x;
    }

    // 8. Sum of first n Fibonacci numbers using cumulative sum
    public static int sumFirstNFibCumulative(int n) {
        int sum = 0;
        int a = 0, b = 1;
        if (n >= 1) sum += a;
        if (n >= 2) sum += b;
        for (int i = 2; i < n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }
        return sum;
    }

    // 9. Sum of first n Fibonacci numbers without cumulative sum
    public static int sumFirstNFibFormula(int n) {
        return nthFibonacci(n + 2) - 1;
    }

    // 10. Previous Fibonacci number O(n)
    public static int previousFibOn(int n) {
        if (n == 0) return -1;
        int a = 0, b = 1;
        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    // 11. Previous Fibonacci number O(sqrt(n))
    public static int previousFibOsqrt(int n) {
        if (!isFibonacciOsqrt(n)) return -1;
        double phi = (1 + Math.sqrt(5)) / 2;
        int k = (int) Math.round(Math.log(n * Math.sqrt(5) + 0.5) / Math.log(phi));
        return nthFibonacci(k - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        System.out.println("1. nth Fibonacci (10): " + nthFibonacci(10));
        System.out.print("2. First 10 Fibonacci: ");
        displayFirstNFib(10);
        System.out.println("3. Return first 10 Fibonacci: " + Arrays.toString(returnFirstNFib(10)));
        System.out.print("4. Fibonacci up to 50: ");
        displayFibUptoN(50);
        System.out.println("5. Return Fibonacci up to 50: " + returnFibUptoN(50));
        System.out.println("6. Verify 21 (O(n)): " + isFibonacciOn(21));
        System.out.println("7. Verify 22 (O(sqrt(n))): " + isFibonacciOsqrt(22));
        System.out.println("8. Sum first 10 Fibonacci (cumulative): " + sumFirstNFibCumulative(10));
        System.out.println("9. Sum first 10 Fibonacci (formula): " + sumFirstNFibFormula(10));
        System.out.println("10. Previous of 21: " + previousFibOn(21));
        System.out.println("11. Previous of 21 (sqrt): " + previousFibOsqrt(21));
    }
}

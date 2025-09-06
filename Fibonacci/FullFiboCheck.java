import java.util.*;

public class FullFiboCheck {
    public static void main(String[] args) {
        int n = 21;
        System.out.println(isFibo(n) ? n + " is a Fibonacci number" : n + " is not a Fibonacci number");
    }
    static boolean isPerfectSquare(int x) {
        int s = (int)Math.sqrt(x);
        return s * s == x;
    }
    static boolean isFibo(int n) {
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }
}

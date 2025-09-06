import java.util.*;

public class FiboLastTwoDigits {
    public static void main(String[] args) {
        long n = 123456789L;
        System.out.println(lastTwoDigits(n));
    }
    static int lastTwoDigits(long n) {
        int pisano = 300;
        n = n % pisano;
        if (n <= 1) return (int)n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % 100;
            a = b; b = c;
        }
        return c;
    }
}

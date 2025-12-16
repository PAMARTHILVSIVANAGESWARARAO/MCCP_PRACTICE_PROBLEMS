import java.util.*;

public class FiboLastDigit {
    public static void main(String[] args) {
        long n = 123456789L;
        System.out.println(lastDigit(n));
    }
    static int lastDigit(long n) {
        int pisano = 60;
        n = n % pisano;
        if (n <= 1) return (int)n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = (a + b) % 10;
            a = b; b = c;
        }
        return c;
    }
}

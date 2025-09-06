import java.util.*;

public class NthEvenFibo {
    public static void main(String[] args) {
        int n = 5; 
        System.out.println(evenFibo(n));
    }
    static int evenFibo(int n) {
        if (n == 1) return 2;
        if (n == 2) return 8;
        int a = 2, b = 8, c = 0;
        for (int i = 3; i <= n; i++) {
            c = 4 * b + a;
            a = b; b = c;
        }
        return c;
    }
}

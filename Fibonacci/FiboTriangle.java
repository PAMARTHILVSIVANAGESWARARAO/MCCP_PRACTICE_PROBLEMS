import java.util.*;

public class FiboTriangle {
    public static void main(String[] args) {
        int n = 5;
        printTriangle(n);
    }
    static void printTriangle(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}

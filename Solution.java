import java.util.Scanner;
public class Solution {
    public int isPrime(int A) {
        return isPrime2(A) ? 1 : 0;
    }

    static boolean isPrime2(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        int limit = (int)Math.sqrt(n);
        for (int i = 5; i <= limit; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.isPrime(num));
        sc.close();
    }
}

import java.util.*;
class NthevenFibo { 
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find the n th even fibonacci number:");
        int n = sc.nextInt();
        int result = findNthEvenFibonacci(n);
        System.out.println("The " + n + "th even Fibonacci number is: " + result);

        System.out.println("Using second method "+NthevenFibofun(n));
        sc.close();
    }

    public static int findNthEvenFibonacci(int n) {
        
        if (n == 1) return 2;
        if (n == 2) return 8;
        int a = 2, b = 8, res = 0;
        for (int i = 3; i <= n; i++) {
            res = 4 * b + a;
            a = b;
            b = res;
        }
        return res;
    }

    public static int NthevenFibofun(int n ){
        int a = 0, b = 1, count = 0, evenFibo = 0;
        while (count < n) {
            int next = a + b;
            a = b;
            b = next;
            if (b % 2 == 0) {
                evenFibo = b;
                count++;
            }
        }
        return evenFibo;
    }

}
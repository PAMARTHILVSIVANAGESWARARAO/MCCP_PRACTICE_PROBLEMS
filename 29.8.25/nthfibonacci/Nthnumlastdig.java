import java.util.*;



public class Nthnumlastdig{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find the n th number from last digit:");
        int n = sc.nextInt();
        System.out.println("The " + n + "th number from last digit is: " + findNthFromLast(n));
        System.out.println("Finding Two Digits   " + findNthFromLastTwo(n));
        sc.close();
    }
    public static int findNthFromLast(int n) {
        int N = n%60;
        int f[] = new int[N+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= N; i++) {
            f[i] = (f[i-1] + f[i-2]) % 10;
        }
        return f[N];
    }

     public static int findNthFromLastTwo(int n) {
        int N = n%60;
        int f[] = new int[N+1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= N; i++) {
            f[i] = (f[i-1] + f[i-2]) % 100;
        }
        return f[N];
    }

} 
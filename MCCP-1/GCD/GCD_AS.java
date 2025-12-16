// package GCD;
public class GCD_AS {
    public static int findGcd(int m, int n) {
        while (m!=n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
            
        }
        return m;

    }

    public static void main(String[] args) {
        int m = 48;
        int n = 18;
        System.out.println("GCD of " + m + " and " + n + " is: " + findGcd(m, n));
    }
}

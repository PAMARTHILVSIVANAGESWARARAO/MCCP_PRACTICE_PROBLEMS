// package GCD;
public class Gcd_Eucidian {
    public static int fGCD(int m ,int n){
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
            
        }
        return m;
    }

    public static void main(String[] args) {
        int m = 48;
        int n = 18;
        System.out.println("GCD of " + m + " and " + n + " is: " + fGCD(m, n));
    }
}

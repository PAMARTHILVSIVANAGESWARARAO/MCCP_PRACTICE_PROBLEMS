// package LCM;

public class Lcm_without_Gcd {
    public static void main(String[] args) {
        int m = 48;
        int n = 18;
        int lcm = findLCD(m, n);
        System.out.println("LCM of " + m + " and " + n + " is: " + lcm);
    }
    public static int findLCD(int m , int n){
        int x = Math.max(m, n);
        int y = Math.min(m, n);
        for (int i = x; i <= m * n; i += x) {
            if (i % y == 0) {
                return i;
            }
        }
        return -1; // If no LCM is found (should not happen for positive integers)
    }
}

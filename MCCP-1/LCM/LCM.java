public class LCM{

    
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
        int gcd = fGCD(m, n);
        int lcm = (m * n) / gcd;
        System.out.println("LCM of " + m + " and " + n + " is: " + lcm);
    }
}
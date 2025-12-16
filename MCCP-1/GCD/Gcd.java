// package GCD;
// 

class GCD {
     public static int findGCD(int m,int n){
        int res = Math.min(m, n);
        while (res >1){
            if(m%res == 0 && n%res == 0){
                return res;
            }
            res--;
        }
        return 1;
     }
     public static void main(String[] args) {
        int m = 48;
        int n = 18;
        System.out.println("GCD of " + m + " and " + n + " is: " + findGCD(m, n));
     }
}
import java.util.Arrays;
public class Prime_Numbers_upto_n {
    
    //--------------------------------------------------------------------------------------------------------------
    boolean isprime1(int n) {
        int c = 0;
        for(int i=1;i<=n;i++){
            if(n % i == 0) {
                c++;
            }
        }
        if(c == 2) {
            return true; // n is prime
        } else {
            return false; // n is not prime
        }
    }


    void findPrime1(int n) {
        System.out.println("Method 1 :Prime numbers up to " + n + ":");
        for(int i=2; i<=n; i++) {
            if(isprime1(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line after printing all primes

    }
    //--------------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------------------------------

    boolean isprime2(int n) {
        int c = 1;
        for(int i=1;i<=n/2;i++){
            if(n % i == 0) {
                c++;
            }
        }
        if(c == 2) {
            return true; // n is prime
        } else {
            return false; // n is not prime
        }
    }

    void findPrime2(int n) {
        System.out.println("Method 2 :Prime numbers up to " + n + ":");
        for(int i=2; i<=n; i++) {
            if(isprime2(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line after printing all primes
    }
    //--------------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------------------------------
    boolean isprime3(int n) {
        int c =0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n % i == 0) {
                c++;
                if(n / i != i) {
                    c++; // Count the corresponding divisor
                }
            }
        }
        if(c == 2) {
            return true; // n is prime
        } else {
            return false; // n is not prime
        }

    }

    void findPrime3(int n) {
        System.out.println("Method 3 :Prime numbers up to " + n + ":");
        for(int i=2; i<=n; i++) {
            if(isprime3(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line after printing all primes
    }

    //--------------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------------------------------
    boolean isPrime4(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false; // n is not prime
            }
        }
        return true; // n is prime
    }

    void findPrime4(int n) {
        System.out.println("Method 4 :Prime numbers up to " + n + ":");
        for(int i=2; i<=n; i++) {
            if(isPrime4(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line after printing all primes
    }
    //--------------------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------------------------------------------
    boolean isprime5(int n) {
        if(n<=1)
            return false; // 0 and 1 are not prime numbers
        if(n==2||n==3)
            return true; // 2 and 3 are prime numbers
        if(n % 2 == 0||n%3==0)
            return false; // eliminate even numbers and multiples of 3
        for(int i=5; i*i<=n; i+=6) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false; // n is not prime
            }
        }
        return true; // n is prime
    }
    void findPrime5(int n) {
        System.out.println("Method 5 :Prime numbers up to " + n + ":");
        for(int i=2; i<=n; i++) {
            if(isprime5(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line after printing all primes
    }
    //--------------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------------------------------
    void findPrimesUsingseivemethod(int n){
        boolean[] p = new boolean[n+1];
        Arrays.fill(p, true);
        p[0] = p[1] = false;

        for(int i=2; i*i<=n; i++) {
            if(p[i]) {
                for(int j=i*i; j<=n; j+=i) {
                    p[j] = false;
                }
            }
        }

        System.out.println("Method 6 :Prime numbers up to " + n + ":");
        for(int i=2; i<=n; i++) {
            if(p[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for a new line after printing all primes
    }
    //--------------------------------------------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        Prime_Numbers_upto_n primeFinder = new Prime_Numbers_upto_n();
        int n = 20; // You can change this value to find primes up to a different number

        primeFinder.findPrime1(n);
        primeFinder.findPrime2(n);
        primeFinder.findPrime3(n);
        primeFinder.findPrime4(n);
        primeFinder.findPrime5(n);
        primeFinder.findPrimesUsingseivemethod(n);
    }
}
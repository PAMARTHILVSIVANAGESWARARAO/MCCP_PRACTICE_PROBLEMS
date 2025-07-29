public class PrimeFactors {

    void findPrimeFactors(int n) {
        while (n%2==0) {
            System.out.print(2 + " ");
            n /= 2;
            
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        PrimeFactors pf = new PrimeFactors();
        int number = 60; // Example number to find prime factors
        System.out.println("Prime factors of " + number + " are:");
        pf.findPrimeFactors(number);
    }
    
}

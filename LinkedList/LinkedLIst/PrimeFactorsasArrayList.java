import java.util.ArrayList;

public class PrimeFactorsasArrayList {

    ArrayList<Integer> findPrimeFactors(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        if (n > 1) {
            factors.add(n);
        }

        return factors;
    }

    public static void main(String[] args) {
        PrimeFactorsasArrayList pf = new PrimeFactorsasArrayList(); // ✅ Class name fixed
        int number = 60;
        ArrayList<Integer> result = pf.findPrimeFactors(number);

        System.out.println("Prime factors of " + number + " are:");
        System.out.println(result);
    }
}

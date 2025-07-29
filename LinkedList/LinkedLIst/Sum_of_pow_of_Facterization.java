import java.util.ArrayList;

public class Sum_of_pow_of_Facterization {

    // Method to find prime factors and return them as an ArrayList
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

    // Method to count powers of 2, 3, 5, and index-based match
    int sumofpowersoffactors(int n) {
        int count_2 = 0;
        int count_3 = 0;
        int count_5 = 0;
        int count_i = 0;

        ArrayList<Integer> factors = findPrimeFactors(n);

        for (int i = 0; i < factors.size(); i++) {
            int val = factors.get(i);
            if (val == 2) count_2++;
            if (val == 3) count_3++;
            if (val == 5) count_5++;
            if (val == i) count_i++;
        }

        return count_2 + count_3 + count_5 + count_i;
    }

    public static void main(String[] args) {
        Sum_of_pow_of_Facterization pf = new Sum_of_pow_of_Facterization();
        int number = 60;

        ArrayList<Integer> result = pf.findPrimeFactors(number);
        int powerSum = pf.sumofpowersoffactors(number);

        System.out.println("Prime factors of " + number + " are:");
        System.out.println(result);

        System.out.println("Sum of powers of prime factors: " + powerSum);
        System.out.println("Sum of powers of prime factors using Length of result ArrayList: " + result.size());

        
    }
}

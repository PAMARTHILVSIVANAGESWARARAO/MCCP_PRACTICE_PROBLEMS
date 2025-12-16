import java.util.ArrayList;
import java.util.Arrays;

public class SeiveMethodArrayLList {

    void findPrimesUsingSeiveMethod(int n) {
        boolean[] p = new boolean[n + 1];
        Arrays.fill(p, true);
        p[0] = p[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (p[i]) {
                for (int j = i * i; j <= n; j += i) {
                    p[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (p[i]) {
                primes.add(i);
            }
        }

        System.out.println(" Prime numbers up to " + n + " Using Seive method Printing in ArrayList:");
        System.out.println(primes); // printing the ArrayList of primes
    }

    public static void main(String[] args) {
        SeiveMethodArrayLList obj = new SeiveMethodArrayLList();
        obj.findPrimesUsingSeiveMethod(50); // example call
    }
}

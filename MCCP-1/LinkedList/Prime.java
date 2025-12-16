package LinkedList;

import java.util.Scanner;

public class Prime {
    boolean isPrime1(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true; // n is prime
        } else {
            return false; // n is not prime
        }
    }

    boolean isPrime2(int n) {
        int c = 1; // keeping your initialization
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true; // n is prime
        } else {
            return false; // n is not prime
        }
    }

    boolean isPrime3(int n) {
        int c = 0;
        // FIX: loop condition must compare i*i <= n instead of Math.sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true; // n is prime
        } else {
            return false; // n is not prime
        }
    }

    boolean isPrime4(int n) {
        // FIX: handle n <= 1 case
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is not prime
            }
        }
        return true; // n is prime
    }

    boolean isPrime5(int n) {
        if (n <= 1)
            return false; // n is not prime
        if (n == 2 || n == 3)
            return true; // n is prime
        if (n % 2 == 0 || n % 3 == 0)
            return false; // n is not prime
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false; // n is not prime
        }
        return true; // n is prime
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime:");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("From Method 1:");
        System.out.println(prime.isPrime1(n));
        System.out.println("From Method 2:");
        System.out.println(prime.isPrime2(n));
        System.out.println("From Method 3:");
        System.out.println(prime.isPrime3(n));
        System.out.println("From Method 4:");
        System.out.println(prime.isPrime4(n));
        System.out.println("From Method 5:");
        System.out.println(prime.isPrime5(n));
    }
}

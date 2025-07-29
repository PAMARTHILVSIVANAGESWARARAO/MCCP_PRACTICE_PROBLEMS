// User function Template for Java

class Solution {
    static int fullPrime(int N) {
        // code here
        
        String str  = ""+N;
        char[] charArray = str.toCharArray();
        int[]  splittedNumberArray = convertDigitChars(charArray);
        
        // Check if the number itself is prime
        if (!isPrime(N)) {
            return 0;
        }
        
        // Check if all digits are prime
        for (int i = 0; i < splittedNumberArray.length; i++) {
            if (!isPrime(splittedNumberArray[i])) {
                return 0;
            }
        }
        
        return 1;
    }
    
    // Make isPrime static so it can be called from static method
    static boolean isPrime(int n) {
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
    
    public static int[] convertDigitChars(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            // Subtract '0' to get the integer value of the digit character
            intArray[i] = charArray[i] - '0'; 
        }
        return intArray;
    }
}
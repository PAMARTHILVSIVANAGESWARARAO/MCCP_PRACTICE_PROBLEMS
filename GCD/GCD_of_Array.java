import java.util.*;
class GCD_of_Array {

     public static int fGCD(int m ,int n){
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
            
        }
        return m;
    }


    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        
        int gcd = arr[0];

        for (int i = 1; i < arr.length; i++) {
            gcd = fGCD(gcd, arr[i]);
        }

        System.out.println("GCD of the array is: " + gcd);
    }
}
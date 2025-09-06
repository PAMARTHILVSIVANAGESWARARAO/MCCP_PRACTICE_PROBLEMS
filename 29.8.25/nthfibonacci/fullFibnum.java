import java.util.Scanner;

public class fullFibnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if(isFibonacci(n)==true ) {
            String num = n + "";
            char[] charArray = num.toCharArray();
            int[] intArray = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = Character.getNumericValue(charArray[i]);
            }
            boolean allFib = true;
            for (int i = 0; i < intArray.length; i++) {
                if (!isFibonacci(intArray[i])) {
                    allFib = false;
                    break;
                }
            }
            if (allFib) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
    public static boolean isFibonacci(int num) {
        if (num < 0) return false;
        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num || num == 0;
    }
    
}

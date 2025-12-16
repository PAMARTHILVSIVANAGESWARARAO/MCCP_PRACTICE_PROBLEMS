import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println("Using Brute Force: ");

        System.out.println(new ReverseString().BruteForceReverse(s));
        System.out.println("Using Two Pointer: ");
        System.out.println(new ReverseString().TwoPointerReverse(s));
    }

    String BruteForceReverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    String TwoPointerReverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }
}

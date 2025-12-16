import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome:");
        String s = sc.nextLine();
        
        System.out.println("Using Brute Force: ");
        System.out.println(new Palindrome().BruteForcePalinDrome(s));
        System.out.println("Using Two Pointer: ");
        System.out.println(new Palindrome().UsingTwoPointer(s));

        sc.close();
    }

    boolean BruteForcePalinDrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    boolean UsingTwoPointer(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
}

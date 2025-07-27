package LinkedList;

public class GCD_of_Array {

    public static int findGcd(int var0, int var1) {
        // Handle zeros to prevent infinite loop
        if (var0 == 0) return var1;
        if (var1 == 0) return var0;

        while (var0 != var1) {
            if (var0 > var1) {
                var0 -= var1;
            } else {
                var1 -= var0;
            }
        }
        return var0; // GCD
    }

    public static void main(String[] args) {
        int[] arr = {12, 15, 21, 45, 30, 89, 18, 24};

        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = findGcd(res, arr[i]);
        }
        System.out.println("GCD of the array: " + res);
    }
}

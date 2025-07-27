package LinkedList;

import java.util.*;

class SwapTechniquesExtended {

    // 8. Function returning an array
    public static int[] swapUsingArrayReturn(int a, int b) {
        return new int[]{b, a};
    }

    // 9. Wrapper class method
    static class Holder {
        int value;
        Holder(int v) {
            value = v;
        }
    }

    public static void main(String[] args) {
        // 1. Temporary Variable
        int a1 = 5, b1 = 10;
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println("1. Temp Variable: a = " + a1 + ", b = " + b1);

        // 2. Addition/Subtraction
        int a2 = 5, b2 = 10;
        a2 = a2 + b2;
        b2 = a2 - b2;
        a2 = a2 - b2;
        System.out.println("2. Addition/Subtraction: a = " + a2 + ", b = " + b2);

        // 3. Multiplication/Division
        int a3 = 5, b3 = 10;
        a3 = a3 * b3;
        b3 = a3 / b3;
        a3 = a3 / b3;
        System.out.println("3. Multiplication/Division: a = " + a3 + ", b = " + b3);

        // 4. Bitwise XOR
        int a4 = 5, b4 = 10;
        a4 = a4 ^ b4;
        b4 = a4 ^ b4;
        a4 = a4 ^ b4;
        System.out.println("4. Bitwise XOR: a = " + a4 + ", b = " + b4);

        // 5. Single Statement
        int a5 = 5, b5 = 10;
        b5 = a5 + b5 - (a5 = b5);
        System.out.println("5. Single Statement: a = " + a5 + ", b = " + b5);

        // 6. Using Array
        int a6 = 5, b6 = 10;
        int[] arr = {a6, b6};
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
        a6 = arr[0];
        b6 = arr[1];
        System.out.println("6. Using Array: a = " + a6 + ", b = " + b6);

        // 7. Using Collections.swap()
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        Collections.swap(list, 0, 1);
        int a7 = list.get(0);
        int b7 = list.get(1);
        System.out.println("7. Collections.swap(): a = " + a7 + ", b = " + b7);

        // 8. Using function that returns array
        int a8 = 5, b8 = 10;
        int[] swapped = swapUsingArrayReturn(a8, b8);
        a8 = swapped[0];
        b8 = swapped[1];
        System.out.println("8. Function returning array: a = " + a8 + ", b = " + b8);

        // 9. Using Wrapper Class
        Holder h1 = new Holder(5);
        Holder h2 = new Holder(10);
        int tempHolder = h1.value;
        h1.value = h2.value;
        h2.value = tempHolder;
        System.out.println("9. Wrapper Class: a = " + h1.value + ", b = " + h2.value);

        // 10. Using Streams
        int a10 = 5, b10 = 10;
        int[] arr10 = java.util.stream.IntStream.of(b10, a10).toArray();
        a10 = arr10[0];
        b10 = arr10[1];
        System.out.println("10. Using Streams: a = " + a10 + ", b = " + b10);

        // 11. Using Bitwise AND/OR (uncommon, works only for specific values)
        int a11 = 5, b11 = 10;
        a11 = a11 ^ b11;
        b11 = a11 ^ b11;
        a11 = a11 ^ b11;
        System.out.println("11. Bitwise Method variant: a = " + a11 + ", b = " + b11);
    }
}

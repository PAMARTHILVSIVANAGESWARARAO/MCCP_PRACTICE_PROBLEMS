import java.util.*;

public class SortWBRBalls {

    // Counting Method
    public static char[] counting(char[] arr) {
        int countW = 0, countB = 0, countR = 0;
        for (char c : arr) {
            if (c == 'w') countW++;
            else if (c == 'b') countB++;
            else if (c == 'r') countR++;
        }
        int index = 0;
        for (int i = 0; i < countW; i++) arr[index++] = 'w';
        for (int i = 0; i < countB; i++) arr[index++] = 'b';
        for (int i = 0; i < countR; i++) arr[index++] = 'r';
        return arr;
    }

    // DNF Algorithm
    public static char[] dnf(char[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 'w') {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 'b') {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        char[] arr1 = {'w', 'b', 'r', 'w', 'b'};
        char[] arr2 = {'w', 'b', 'r', 'w', 'b'};

        System.out.println("Using Counting Method: " + Arrays.toString(counting(arr1)));
        System.out.println("Using DNF Algorithm: " + Arrays.toString(dnf(arr2)));
    }
}

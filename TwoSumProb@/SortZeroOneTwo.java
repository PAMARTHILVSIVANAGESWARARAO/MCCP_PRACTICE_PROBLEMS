import java.util.*;

public class SortZeroOneTwo {

    // Counting Method
    public static int[] counting(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else if (num == 2) count2++;
        }
        int index = 0;
        for (int i = 0; i < count0; i++) arr[index++] = 0;
        for (int i = 0; i < count1; i++) arr[index++] = 1;
        for (int i = 0; i < count2; i++) arr[index++] = 2;
        return arr;
    }

    // DNF Algorithm (Dutch National Flag)
    public static int[] dnf(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 1, 0, 2};
        int[] arr2 = {0, 1, 2, 1, 0, 2};

        System.out.println("Using Counting Method: " + Arrays.toString(counting(arr1)));
        System.out.println("Using DNF Algorithm: " + Arrays.toString(dnf(arr2)));
    }
}

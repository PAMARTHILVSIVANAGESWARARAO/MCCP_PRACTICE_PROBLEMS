import java.util.*;

public class SortArrayByParity {

    // Segregation Method (like partition)
    public static int[] segregation(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) left++;
            while (left < right && arr[right] % 2 == 1) right--;
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return arr;
    }

    // Two Pointer Method
    public static int[] twoPointer(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else if (arr[right] % 2 == 1) {
                right--;
            } else {
                swap(arr, left, right);
                left++;
                right--;
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
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println("Using Segregation: " + Arrays.toString(segregation(arr1)));
        System.out.println("Using Two Pointer: " + Arrays.toString(twoPointer(arr2)));
    }
}

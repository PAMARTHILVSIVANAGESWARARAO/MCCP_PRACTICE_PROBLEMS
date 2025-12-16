import java.util.*;

public class AllSortExamples {

    public static void main(String[] args) {
        // 1. Collections.sort to sort ArrayList in ascending order
        ArrayList<Integer> listAsc = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3));
        Collections.sort(listAsc);
        System.out.println("1. Ascending ArrayList: " + listAsc);

        // 2. Collections.sort to sort ArrayList in descending order
        ArrayList<Integer> listDesc = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3));
        Collections.sort(listDesc, Collections.reverseOrder());
        System.out.println("2. Descending ArrayList: " + listDesc);

        // 3. Collections.sort to sort nested ArrayList in ascending order by first element
        ArrayList<ArrayList<Integer>> nestedAsc = new ArrayList<>();
        nestedAsc.add(new ArrayList<>(Arrays.asList(3, 4)));
        nestedAsc.add(new ArrayList<>(Arrays.asList(1, 2)));
        nestedAsc.add(new ArrayList<>(Arrays.asList(5, 0)));
        Collections.sort(nestedAsc, Comparator.comparingInt(a -> a.get(0)));
        System.out.println("3. Nested Ascending: " + nestedAsc);

        // 4. Collections.sort to sort nested ArrayList in descending order by first element
        ArrayList<ArrayList<Integer>> nestedDesc = new ArrayList<>();
        nestedDesc.add(new ArrayList<>(Arrays.asList(3, 4)));
        nestedDesc.add(new ArrayList<>(Arrays.asList(1, 2)));
        nestedDesc.add(new ArrayList<>(Arrays.asList(5, 0)));
        Collections.sort(nestedDesc, (a, b) -> b.get(0) - a.get(0));
        System.out.println("4. Nested Descending: " + nestedDesc);

        // 5. Arrays.sort to sort array in ascending order
        int[] arrayAsc = {5, 2, 9, 1, 3};
        Arrays.sort(arrayAsc);
        System.out.println("5. Ascending Array: " + Arrays.toString(arrayAsc));

        // 6. Arrays.sort to sort array in descending order
        Integer[] arrayDesc = {5, 2, 9, 1, 3};
        Arrays.sort(arrayDesc, Collections.reverseOrder());
        System.out.println("6. Descending Array: " + Arrays.toString(arrayDesc));

        // 7. Arrays.sort to sort 2D array in ascending order by first column
        int[][] arr2DAsc = { {3, 4}, {1, 2}, {5, 0} };
        Arrays.sort(arr2DAsc, Comparator.comparingInt(a -> a[0]));
        System.out.println("7. 2D Array Ascending: " + Arrays.deepToString(arr2DAsc));

        // 8. Arrays.sort to sort 2D array in descending order by first column
        int[][] arr2DDesc = { {3, 4}, {1, 2}, {5, 0} };
        Arrays.sort(arr2DDesc, (a, b) -> b[0] - a[0]);
        System.out.println("8. 2D Array Descending: " + Arrays.deepToString(arr2DDesc));

        // 9. Hybrid sort (Merge Sort + Insertion Sort when size is small)
        int[] hybridArray = {5, 2, 9, 1, 3, 6, 7, 4, 0, 8};
        hybridSort(hybridArray, 0, hybridArray.length - 1);
        System.out.println("9. Hybrid Sorted Array: " + Arrays.toString(hybridArray));
    }

    // Hybrid sort (merge + insertion)
    static void hybridSort(int[] arr, int left, int right) {
        int threshold = 10;
        if (right - left <= threshold) {
            insertionSort(arr, left, right);
        } else {
            int mid = (left + right) / 2;
            hybridSort(arr, left, mid);
            hybridSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, left, temp.length);
    }
}

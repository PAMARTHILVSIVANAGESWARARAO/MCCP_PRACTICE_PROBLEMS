public class CountOccurence {

    private static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    private static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int CountOccurenceByBinarySearch(int[] arr, int n, int target) {
        int first = findFirst(arr, target);
        if (first == -1) return 0;
        int last = findLast(arr, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 9, 9, 9, 9, 15, 15, 15, 24, 24};
        int n = arr.length;
        int target = 16;
        System.out.println("Count of " + target + " is: " + CountOccurence.CountOccurenceByBinarySearch(arr, n, target));
    }

    public static char[] findRotations(int[] arr, int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findRotations'");
    }
}

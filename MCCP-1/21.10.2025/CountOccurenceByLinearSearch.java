public class CountOccurenceByLinearSearch {
    
    public static int CountLinearSearch(int[] arr, int n, int target) {

        int firstOccurence = -1, lastOccurence = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                firstOccurence = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastOccurence = i;
                break;
            }
        }

        if (firstOccurence == -1 || lastOccurence == -1) {
            return 0;
        } else {
            return lastOccurence - firstOccurence + 1;
        }

        
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 9, 9, 9, 9, 15, 15, 15, 24, 24};
        int n = arr.length;
        int target = 16;
        System.out.println("Count of " + target + " is: " + CountOccurenceByLinearSearch.CountLinearSearch(arr, n, target));
    }
}

public class NumberOfRotation {
    

    public static  int findRotations(int[] arr , int n ){
        int low = 0 , high = n - 1;
        while(low <= high){
            if(arr[low] <= arr[high]){
                return low;
            }

            int mid = low + (high - low) / 2 ;
            int next = (mid + 1) % n ;
            int prev = (mid + n - 1) % n ;

            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }

            if(arr[mid] <= arr[high]){
                high = mid - 1 ;
            }else if(arr[mid] >= arr[low]){
                low = mid + 1 ;
            }
        }
        return 0 ;
    }
    public static void main(String[] args) {
        
        // int[] arr = {8 , 9 , 1 , 2 , 3  , 4 ,5 };
        int[] arr = {16 , 17 , 19 , 25 , 1  , 2 , 3 , 4 , 5, 9 };

        int n=arr.length;
    
         System.out.println(NumberOfRotation.findRotations(arr, n));
 }
}

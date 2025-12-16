public class BinarySearchOnRotatedSortedArray {
    
            
    public static int search(int[] arr , int n , int target){

        int low = 0 , high = n - 1 ;

        while(low <= high){

            int mid = low + (high - low) / 2 ;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[low] <= arr[mid]){

                if(target >= arr[low] && target <= arr [mid]){
                    high = mid - 1 ;
                }else{
                    low = mid + 1 ;
                }

            }else{

                if(target >= arr[mid] && target <= arr[high]){
                    low = mid + 1 ;
                }else{
                    high = mid - 1 ;
                }

            }

        }

        return -1 ;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element to search : ");
        int target = sc.nextInt();


        System.out.println("Index of target " + target + " is : " + search(arr , n , target));

        sc.close();
    }


}

import java.util.HashSet;

public class SumOfDistinctElementsArray {
    public static void main(String[] args) {
        // int a[] = {1 , 5  , 4 , 2  , 9 , 9 , 9};

        int a[] = {1 , 5, 1, 4, 6, 4, 6 ,4};
        //op : [10 , 11, 15 ]
        int k = 3 ;
        int n = a.length;
        // int res[] = new int[n - k + 1];
        

        for(int i = 0 ; i <= n - k ; i++){
            HashSet<Integer> set = new HashSet<>();
            int sum = 0 ;
            for(int j = i ; j < i + k ; j++){
                if(!set.contains(a[j])){
                    sum += a[j];

                    set.add(a[j]);
                }
            }
            if(set.size() == k){
                System.out.print(sum + " ");
            }
        }


        
}

}
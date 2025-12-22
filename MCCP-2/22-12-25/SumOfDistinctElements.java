import java.util.HashSet;

public class SumOfDistinctElements{
    
    public static void main(String[] args) {
        int a[] = {1 , 5  , 4 , 2  , 9 , 9 , 9};
        //op : 15
        int k = 3 ;
        int n = a.length;
        int res[] = new int[n - k + 1];
        int op = 0 ;


        for(int i = 0 ; i <= n - k ; i++){
            HashSet<Integer> set = new HashSet<>();
            int sum = 0 ;
            for(int j = i ; j < i + k ; j++){
                if(!set.contains(a[j])){
                    sum += a[j];
                    set.add(a[j]);
                }
            }
            res[i] = sum;
        }
        for(int i = 0 ; i < res.length ; i++){
            if(res[i] > op){
                op = res[i];
            }
        }


        System.out.println(op);

    }
}

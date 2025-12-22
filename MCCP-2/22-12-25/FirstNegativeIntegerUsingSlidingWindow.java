import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;


public class FirstNegativeIntegerUsingSlidingWindow {


    public static void main(String[] args) {
        


        int a[] = {-3, -2, -5, -8, -6, 6, 4, 9, -3};
        int n = a.length;
        int k = 3;

        int res[] = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        

        //First window
        for (int i =0 ; i<k ; i++){
            if(a[i] < 0){
                dq.addLast(i);
            }
        }
        
        //window for rest of the elements
        for(int i = k ; i < n ; i++){


            if(!dq.isEmpty()){
                res[i - k] = a[dq.peekFirst()];
            }
            else{
                res[i - k] = 0;
            }


            while(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.removeFirst();
            }


            if(a[i] < 0){
                dq.addLast(i);
            }

        }

        
        if(!dq.isEmpty()){
            res[n - k] = a[dq.peekFirst()];
        }
        else{
            res[n - k] = 0;
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }



    }
    
}

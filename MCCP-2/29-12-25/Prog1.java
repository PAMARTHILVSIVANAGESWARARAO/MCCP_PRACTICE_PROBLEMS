import java.util.Arrays;

class Prog1 {
    public static void main(String[] args) {
        
        int start[] = {10 , 12 , 20 };
        int end[] = {20 , 25 , 30 };

        int a[][]  = new int[start.length][2];
        for(int i=0; i<start.length; i++){
            a[i][0] = start[i];
            a[i][1] = end[i];
        }
        Arrays.sort(a, (x,y) -> x[1] - y[1]);

        int  j=1 , ans = 1;
        for(int i=1; i<a.length; i++){
            if(a[i][0] > a[j-1][1]){
                ans++;
                j = i;
            }
        }
        System.out.println(ans);
        
        
        
    }
     
}
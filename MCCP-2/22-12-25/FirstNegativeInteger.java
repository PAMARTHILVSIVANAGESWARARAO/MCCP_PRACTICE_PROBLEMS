import java.util.Scanner;;

class FirstNegativeInteger {

    
    public static void main(String[] args) {
        int a[] = {-3 , -2 , -5 , -8 , -6 , 6 , 4 , 9 , -3};

        int k = 3 ;

        int n = a.length;
        int res[] = new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            for(int j=i;j<i+k;j++){
                if(a[j]<0){
                    res[i] = a[j];
                    break;
                }
                else{
                    res[i] = 0;
                }
            }
        }

       for(int i = 0 ; i < res.length ; i++){
           System.out.print(res[i] + " ");
       }

       

    }
}
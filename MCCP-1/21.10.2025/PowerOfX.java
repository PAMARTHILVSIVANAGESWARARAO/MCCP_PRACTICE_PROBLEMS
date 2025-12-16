public class PowerOfX {
    
    

    public static int powerOfXUsingLoop(int x , int n ){
        int result = 1 ;
        for(int i = 1 ; i <= n ; i++){
            result = result * x ;
        }
        return result ;
    }


    public static int powerOfXUsingRecursion(int x , int n ){

        int result = 1 ;
        if(n == 0){
            return 1 ;
        }

        

        if(n%2 == 0) {
            int halfPower = powerOfXUsingRecursion(x , n / 2 );
            result = halfPower * halfPower ;
        }
        else {
            result = x * powerOfXUsingRecursion(x , n - 1 );
        }

        return result ;
    }
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter base x : ");
        int x = sc.nextInt();
        System.out.println("Enter power n : ");
        int n = sc.nextInt();


        System.out.println("O(n) Solution : " + powerOfXUsingLoop(x , n));
        System.out.println("O(log n) Solution : " + powerOfXUsingRecursion(x , n));

        sc.close();
    }
}
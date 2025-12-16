public class Prob6 {
    public static void main(String[] args) {
        String arr[] = {"code" , "cat" , "challenge"};

        String res = "";

        String result[] = new String[arr.length];

        for(int i=0 ; i<arr.length ; i++){
            
            int l = arr[i].length();
            res = String.valueOf(l)+"#"+String.valueOf(arr[i]);

            result[i] = res;
        }

        for(String s : result){
            System.out.println(s);
        }
    }
}

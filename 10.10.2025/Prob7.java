public class Prob7 {
    public static void main(String[] args) {
        String s = "hello cse this is coding";

        String words[] = s.split(" ");
        String res = "";

        for(int i=words.length-1 ; i>=0 ; i--){
            res = res + words[i] + " ";
        }

        System.err.println(res.trim());
    }
}

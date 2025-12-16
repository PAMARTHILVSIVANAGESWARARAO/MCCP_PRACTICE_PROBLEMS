public class Prob4 {


    static String ConversionIncrDecr(String s1 ){
        char ch[] = s1.toCharArray();
        for(int i = 0;i < ch.length;i++){
            if(i%2 == 0){
                if (ch[i] == 'a') ch[i] = 'z';
                else ch[i] = (char)(ch[i] - 1);
            }else{
                if (ch[i] == 'z') ch[i] = 'a';
                else ch[i] = (char)(ch[i] + 1);
            }
        }
        String encoded = new String(ch);
        return encoded;

    }
    public static void main(String[] args) {
        String input = "hello";

        System.out.println(ConversionIncrDecr(input));
    }
}

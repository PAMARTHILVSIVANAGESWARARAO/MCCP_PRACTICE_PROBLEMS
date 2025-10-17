public class Prob5 {


    static String ConversionIncSeq(String s1 ){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);
            int shift = i;
            char newc = (char) ((c - 'a' + shift) % 26 + 'a');
            sb.append(newc);
        }
        return sb.toString();
    }
    public static void main(String[] args) {


        Prob5 ob = new Prob5();
        String s = "azy"; //output : aaa

        String s1 = "rat" ; ///output : rbv

        String s2 = "vijay"; //output : gdkkn
        System.out.println(ob.ConversionIncSeq(s));
        System.out.println(ob.ConversionIncSeq(s1));
        System.out.println(ob.ConversionIncSeq(s2));

    }
}

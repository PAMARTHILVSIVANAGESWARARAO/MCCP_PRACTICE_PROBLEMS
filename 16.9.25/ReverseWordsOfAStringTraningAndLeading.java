public class ReverseWordsOfAStringTraningAndLeading {

    public static String reverseWords(String s) {
        String[] words = s.split("\\.+");
        String[] dots = s.split("[^\\.]+");

        String res = "";
        int w = words.length - 1;
        int d = dots.length - 1;

        while (w >= 0 || d >= 0) {
            if (d >= 0 && (res.length() != 0)) {
                res += dots[d];
            }
            d--;
            if (w >= 0) {
                res += words[w];
                w--;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String input = ".i.like..this.program.very.much.";
        String result = reverseWords(input);
        System.out.println("Reversed words: \n\n" + result);
    }
}

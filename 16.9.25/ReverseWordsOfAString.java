public class ReverseWordsOfAString {

    public static String reverseWords(String s) {
        String[] words = new String[100];
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                words[count++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[count++] = s.substring(start);

        String res = "";
        for (int i = count - 1; i >= 0; i--) {
            res += words[i];
            if (i != 0) res += ".";
        }

        return res;
    }

    public static void main(String[] args) {
        String input = "i.like.this.program.very.much";
        String result = reverseWords(input);
        System.out.println("Reversed words:\n\n " + result);
    }
}

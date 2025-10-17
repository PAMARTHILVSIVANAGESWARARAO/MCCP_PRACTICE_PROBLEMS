class Prob1 {
    String printRle(String str) {
        
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Prob1 solution = new Prob1();
        String input = "abbbcddaaa";
        String output = solution.printRle(input);
        System.out.println(output); 
    }
}
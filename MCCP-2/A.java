import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int n = 10000;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int mul = i * 9;
            int sum = 0;

            int temp = mul;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == 9) {
                list.add(mul);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        int n = 10000;

        ArrayList<Integer> pass1 = new ArrayList<>();
        ArrayList<Integer> pass2 = new ArrayList<>();
        ArrayList<Integer> pass3 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int mul = i * 9;

            int s1 = digitSum(mul);
            if (s1 == 9) {
                pass1.add(mul);
            } else {
                int s2 = digitSum(s1);
                if (s2 == 9) {
                    pass2.add(mul);
                } else {
                    int s3 = digitSum(s2);
                    if (s3 == 9) {
                        pass3.add(mul);
                    }
                }
            }
        }

        System.out.println("Pass 1:");
        System.out.println(pass1.size());
        System.out.println(pass1);

        System.out.println("Pass 2:");
        System.out.println(pass2.size());
        System.out.println(pass2);

        System.out.println("Pass 3:");
        System.out.println(pass3.size());
        System.out.println(pass3);
    }

    static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

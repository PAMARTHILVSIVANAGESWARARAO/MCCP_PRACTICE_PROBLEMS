public class Setbits {

    int setbits1(int n) {
        int c = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                c++;
            }
            n = n / 2;
        }
        return c;
    }

    int setbitts2(int n) {
        int c = 0;
        while (n > 0) {
            int m = n & (n - 1);
            c++;
            n = m;
        }
        return c;
    }

    int setbits3(int n) {
        int c = 0;
        while (n > 0) {
            c = c + (n & 1);
            n = n >> 1;
        }
        return c;
    }

    String setbits4(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return "Binary representation: " + binaryString + ", Set bits: " + count;
    }

    public static void main(String[] args) {
        Setbits sb = new Setbits();
        int n = 29;
        System.out.println("Set bits in " + n + " using method 1: " + sb.setbits1(n));
        System.out.println("Set bits in " + n + " using method 2: " + sb.setbitts2(n));
        System.out.println("Set bits in " + n + " using method 3: " + sb.setbits3(n));
        System.out.println("Set bits in " + n + " using method 4: " + sb.setbits4(n));
    }
}

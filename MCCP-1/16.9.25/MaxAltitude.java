import java.util.Scanner;

public class MaxAltitude {

    public static int findMaxAltitude(int[] heights) {
        if (heights.length == 0) return 0; // or throw exception, but assume at least one
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of buildings: ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.print("Enter heights: ");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxAltitude = findMaxAltitude(heights);
        System.out.println("Maximum altitude: " + maxAltitude);

        sc.close();
    }
}

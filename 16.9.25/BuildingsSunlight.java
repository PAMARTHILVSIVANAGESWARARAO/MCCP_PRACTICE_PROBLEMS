import java.util.*;

public class BuildingsSunlight {

    // Method 1: Using simple for loop
    public static int countWithLoop(int[] heights) {
        if (heights.length == 0) return 0;
        int count = 1; // first building always sees sun
        int maxHeight = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                count++;
                maxHeight = heights[i];
            }
        }
        return count;
    }

    // Method 2: Using stack
    public static int countWithStack(int[] heights) {
        if (heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(heights[0]);
        int count = 1;
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                count++;
            }
            stack.push(heights[i]);
        }
        return count;
    }

    // Method 3: Using stack and array (using ArrayList to store visible heights)
    public static int countWithStackAndArray(int[] heights) {
        if (heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        List<Integer> visible = new ArrayList<>();
        stack.push(heights[0]);
        visible.add(heights[0]);
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && stack.peek() <= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                visible.add(heights[i]);
            }
            stack.push(heights[i]);
        }
        return visible.size();
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

        System.out.println("Using simple for loop: " + countWithLoop(heights));
        System.out.println("Using stack: " + countWithStack(heights));
        System.out.println("Using stack and array: " + countWithStackAndArray(heights));

        sc.close();
    }
}

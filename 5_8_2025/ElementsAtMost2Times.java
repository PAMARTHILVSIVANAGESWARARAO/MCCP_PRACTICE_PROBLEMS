import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class ElementsAtMost2Times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 2; // fixed value

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Elements occurring at most " + k + " times:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() <= k) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}

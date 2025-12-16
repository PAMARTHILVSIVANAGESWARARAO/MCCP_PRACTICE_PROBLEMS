import java.util.*;

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] rollNos = new int[n];
        double[] cgpas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            rollNos[i] = sc.nextInt();
            System.out.print("Enter CGPA for student " + (i + 1) + ": ");
            cgpas[i] = sc.nextDouble();
        }

        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(rollNos[i], cgpas[i]);
        }

        System.out.println("\nStudent details (Roll No -> CGPA):");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

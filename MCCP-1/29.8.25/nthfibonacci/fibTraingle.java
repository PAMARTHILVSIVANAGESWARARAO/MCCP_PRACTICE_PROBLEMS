import java.util.Scanner;

class FibTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for Fibonacci triangle:");
        int rows = sc.nextInt();
        System.out.println("Fibonacci triangle:");
        printFibonacciTriangle(rows);
        sc.close();
    }

    public static void printFibonacciTriangle(int rows) {
        int size = rows * (rows + 1) / 2; 
        int arr[] = new int[size];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                arr[index++] = findFibonacci(j);
            }
        }

        index = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(arr[index++] + " ");
            }
            System.out.println();
        }
    }

    public static int findFibonacci(int n) {
        if (n <= 1) return n;
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }
}

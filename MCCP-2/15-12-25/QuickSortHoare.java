class QuickSortHoare {
    static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int p = partition(a, l, h);
            quickSort(a, l, p);
            quickSort(a, p + 1, h);
        }
    }

    static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l - 1, j = h + 1;
        while (true) {
            do { i++; } while (a[i] < pivot);
            do { j--; } while (a[j] > pivot);
            if (i >= j) return j;
            int t = a[i]; a[i] = a[j]; a[j] = t;
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};
        quickSort(a, 0, a.length - 1);
        for (int x : a) System.out.print(x + " ");
    }
}

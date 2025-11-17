import java.util.Scanner;

public class NamGiaiThuat {
    public static int[] nhapMang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void inMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // 1. Bubble Sort
    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    // 2. Selection Sort
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) min = j;
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }

    // 3. Insertion Sort
    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // 4. Quick Sort
    public static void quickSort(int[] a, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;
        int key = a[mid];
        int i = l, j = r;

        while (i <= j) {
            while (a[i] < key) i++;
            while (a[j] > key) j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }

        if (l < j) quickSort(a, l, j);
        if (i < r) quickSort(a, i, r);
    }

    // 5. Merge Sort
    public static void mergeSort(int[] a, int l, int r) {
        if (l >= r) return;

        int mid = (l + r) / 2;
        mergeSort(a, l, mid);
        mergeSort(a, mid + 1, r);
        merge(a, l, mid, r);
    }

    private static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        for (int i = 0; i < n1; i++) left[i] = a[l + i];
        for (int j = 0; j < n2; j++) right[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) a[k++] = left[i++];
            else a[k++] = right[j++];
        }

        while (i < n1) a[k++] = left[i++];
        while (j < n2) a[k++] = right[j++];
    }

    public static void main(String[] args) {

        int[] arr = nhapMang();

        System.out.println("Mảng ban đầu:");
        inMang(arr);


        int[] b1 = arr.clone();
        int[] b2 = arr.clone();
        int[] b3 = arr.clone();
        int[] b4 = arr.clone();
        int[] b5 = arr.clone();

        bubbleSort(b1);
        System.out.print("Bubble Sort: ");
        inMang(b1);

        selectionSort(b2);
        System.out.print("Selection Sort: ");
        inMang(b2);

        insertionSort(b3);
        System.out.print("Insertion Sort: ");
        inMang(b3);

        quickSort(b4, 0, b4.length - 1);
        System.out.print("Quick Sort: ");
        inMang(b4);

        mergeSort(b5, 0, b5.length - 1);
        System.out.print("Merge Sort: ");
        inMang(b5);
    }
}

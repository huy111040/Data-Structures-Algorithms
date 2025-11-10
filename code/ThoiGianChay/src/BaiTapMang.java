import java.util.Arrays;
import java.util.Scanner;

public class BaiTapMang {

    public static int[] nhapMang(Scanner sc) {
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void xuatMang(int[] a) {
        System.out.print("Các phần tử trong mảng: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void timMaxMin(int[] a) {
        int max = a[0], min = a[0];
        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);
    }

    public static void demChan(int[] a) {
        int dem = 0;
        for (int x : a) {
            if (x % 2 == 0) dem++;
        }
        System.out.println("Số phần tử chẵn trong mảng: " + dem);
    }

    public static boolean laNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void timNguyenTo(int[] a) {
        System.out.print("Các số nguyên tố trong mảng: ");
        boolean co = false;
        for (int x : a) {
            if (laNguyenTo(x)) {
                System.out.print(x + " ");
                co = true;
            }
        }
        if (!co) System.out.print("Không có số nguyên tố nào");
        System.out.println();
    }

    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
        System.out.print("Mảng sau khi sắp xếp tăng dần: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = nhapMang(sc);
        System.out.println();

        xuatMang(a);
        timMaxMin(a);
        demChan(a);
        timNguyenTo(a);
        sapXepTang(a);

        sc.close();
    }
}

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();

        long t1 = System.currentTimeMillis();
        System.out.println("Giai thừa của " + n + " (lặp) = " + giaiThuaLap(n));
        long t2 = System.currentTimeMillis();
        System.out.println("Thời gian chạy (lặp): " + (t2 - t1) + " ms");

        long t3 = System.currentTimeMillis();
        System.out.println("Giai thừa của " + n + " (đệ quy) = " + giaiThuaDeQuy(n));
        long t4 = System.currentTimeMillis();
        System.out.println("Thời gian chạy (đệ quy): " + (t4 - t3) + " ms");
    }
    public static long giaiThuaLap(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;

    }
    public static long giaiThuaDeQuy(int n) {
        if (n == 0 || n == 1) return 1;
        return n * giaiThuaDeQuy(n - 1);
    }
}

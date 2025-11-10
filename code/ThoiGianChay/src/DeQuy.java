public class DeQuy {

    public static int tong(int n) {
        if (n == 1) return 1;
        return n + tong(n - 1);
    }


    public static int mu(int a, int n) {
        if (n == 0) return 1;
        return a * mu(a, n - 1);
    }


    public static int ucln(int a, int b) {
        if (b == 0) return a;
        return ucln(b, a % b);
    }


    public static int bcnn(int a, int b) {
        return (a * b) / ucln(a, b);
    }


    public static String toBinary(int n) {
        if (n == 0) return "";
        return toBinary(n / 2) + (n % 2);
    }


    public static void haNoi(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("   Chuyển đĩa 1 từ " + A + " sang " + C);
            return;
        }
        haNoi(n - 1, A, C, B);
        System.out.println("   Chuyển đĩa " + n + " từ " + A + " sang " + C);
        haNoi(n - 1, B, A, C);
    }


    public static void main(String[] args) {
        System.out.println("===== BÀI 1: TỔNG TỪ 1 ĐẾN n =====");
        int n = 10;
        System.out.println("Tổng từ 1 đến " + n + " = " + tong(n));

        System.out.println("\n===== BÀI 2: LŨY THỪA A^N =====");
        int a = 2, m = 5;
        System.out.println(a + "^" + m + " = " + mu(a, m));

        System.out.println("\n===== BÀI 3: ƯỚC SỐ CHUNG LỚN NHẤT (UCLN) =====");
        int x = 24, y = 18;
        System.out.println("UCLN(" + x + ", " + y + ") = " + ucln(x, y));

        System.out.println("\n===== BÀI 4: BỘI SỐ CHUNG NHỎ NHẤT (BCNN) =====");
        System.out.println("BCNN(" + x + ", " + y + ") = " + bcnn(x, y));

        System.out.println("\n===== BÀI 5: ĐỔI SỐ THẬP PHÂN SANG NHỊ PHÂN =====");
        int dec = 13;
        System.out.println(dec + " ở dạng nhị phân là: " + toBinary(dec));

        System.out.println("\n===== BÀI 6: THÁP HÀ NỘI =====");
        int soDia = 3;
        System.out.println("Các bước di chuyển " + soDia + " đĩa:");
        haNoi(soDia, 'A', 'B', 'C');

        System.out.println("\n===== KẾT THÚC CHƯƠNG TRÌNH =====");
    }
}

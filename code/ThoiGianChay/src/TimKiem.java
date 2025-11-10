import java.util.Scanner;

public class TimKiem {
    public static void main(String[] args) {
        int[] a = {5, 8, 3, 7, 1, 15, 9, 6};
//        int tim = 100;
//        if (timKiemTuanTu(a, tim) == -1)
//            System.out.println(tim + " khong co trong mang a");
//        else
//            System.out.printf("Chi so cua %d trong mang a là %d", tim, timKiemTuanTu(a, tim));

//        int[] b = {1, 3, 5, 6, 7, 8, 9, 15};
        int[]b = new int[5];
        nhapMang(b);
        int tim1 = 3;
        if (timNhiPhan_Lap(b, 0, b.length - 1, tim1) == -1)
            System.out.println(tim1 + " khong co trong mang b");
        else
            System.out.printf("Chi so cua %d trong mang b là %d", tim1, timNhiPhan_Lap(b, 0, b.length - 1, tim1));
    }
    // phương thức nhập mảng a từ bàn phím
    public static void nhapMang(int[] a) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Nhap a[%d]: ", i);
            a[i] = sc.nextInt();
        }
    }

    // tim kiem nhi phan, yeu cau mang dc sap xep, de quy
    public static int timNhiPhan_DQ(int[] a, int left, int right, int key) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if (a[mid] == key) return mid;
        if (key < a[mid]) return timNhiPhan_DQ(a, left, mid - 1, key);
        else return timNhiPhan_DQ(a, mid + 1, right, key);
    }

    // tim kiem nhi phan, yeu cau mang dc sap xep, khong de quy dung vong lap
    public static int timNhiPhan_Lap(int[] a, int left, int right, int key) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == key) return mid;
            if (key < a[mid]) right = mid - 1;
            else left = mid + 1;
        }
        return -1;
    }


    // tra ve vi tri tim thay gia tri trong mang, -1 neu ko thay
    public static int timKiemTuanTu(int[] a, int giaTri) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == giaTri)
                return i;
        }
        return -1;
    }
}

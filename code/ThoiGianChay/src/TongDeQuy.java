public class TongDeQuy {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Tổng từ 1 đến " + n + " là: " + tong(n));
    }
    public static long tong(int n){
        if (n == 0) return n;
        return n + tong(n-1);
    }
}

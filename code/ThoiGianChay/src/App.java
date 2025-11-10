import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        int n = scanner.nextInt();
        // do thoi gian chay cua ctrinh = pt
        long t0 = System.currentTimeMillis();
        System.out.println(fib_Lap(n));
        long t1 = System.currentTimeMillis();
        System.out.println("thoi gian chay lap " + (t1 - t0));
    }

    // tính phân tu thu n cua day fib
    public static long fib_Lap(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static long fib_DeQuy(int n) {
        if (n <= 1)
            return 0;
        return fib_DeQuy(n - 1) + fib_DeQuy(n - 2); // gọi đệ quy
        
    }

}

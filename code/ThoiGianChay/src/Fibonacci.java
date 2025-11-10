public class Fibonacci {
    public static void main(String[] args) {
        int n = 100000;
        for (int i = 0; i <= n; i++) {
            System.out.println(fib2(i) + "  ");
        }

    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib1(int n) {
        int[] t = new int[100];
        if (t[n] != 0) return t[n];
        if (n <= 1) {
            t[0] = 0;
            t[1] = 1;
            return n;
        }
        t[n]=fib1(n-1)+fib1(n-2);
        return t[n];
    }
    public static int fib2(int n) {
        if (n <= 1) return n;  // 0 hoặc 1 thì trả về chính nó

        int f0 = 0, f1 = 1, fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = f0 + f1; // cộng hai số trước
            f0 = f1;      // dịch chuyển giá trị
            f1 = fn;
        }
        return fn;
    }
}

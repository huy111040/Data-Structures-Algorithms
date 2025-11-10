public class DemoMang {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0] = 2;
        num[1] = 5;
        num[2] = 8;
        num[3] = 1;
        num[4] = num[0] + num[2];
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");
        }
    }
}

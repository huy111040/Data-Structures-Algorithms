import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class DemoMang3 {
    public static void main(String[] args) {
        System.out.print("Nhập vào số n=");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = new int[n];
        Random rd = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(100);
        }
        //in mảng
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
        for (int number : numbers) {
            System.out.print(number + "  ");
        }
        long tong = 0;

        for (int i = 0; i < numbers.length; i++) {
            tong += numbers[i];
        }

        System.out.println("Tổng của mảng numbers là: " + tong);

        int tim = 3;
        int ketQua = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == tim) {
                ketQua = i;
                break;
            }
        }

        if (ketQua == -1)
            System.out.printf("Phần tử %d không được tìm thấy trong mảng%n", tim);
        else
            System.out.printf("Phần tử %d được tìm thấy trong mảng ở vị trí %d%n", tim, ketQua);


    }
}

import java.util.Scanner;

public class DemoMang2 {
    public static void main(String[] args) {
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số từ 1 -> 7: ");
        int day = Integer.parseInt(sc.nextLine());

        if (day >= 1 && day <= 7) {
            System.out.println("Day : " + days[day - 1]);
        } else {
            System.out.println("Invalid day");
        }
    }
}

import java.util.Scanner;

public class SapXepCanBan {
    public static void main(String[] args) {
//        System.out.println("Các giải thuaật sắp xếp cơ bản");
//        int soPhanTu = 10;
//        int[] a = new int[soPhanTu];
//        nhapMang(a);

        int[] a = {1, 4,5,7,12,15,0,2};

        inMang(a);

    }

    public static void sapXepNoiBot(int[] x){
        int n=x.length;
        int tam;
        boolean doiCho;
        for(int i=n-1;i>=0;i--){
            doiCho=false;
            for (int j = 0; j <= i-1; j++) {
                if(x[j]>x[j+1]){
                    //đổi chỗ
                    doiCho=true;
                    tam=x[j];
                    x[j]=x[j+1];
                    x[j+1]=tam;
                }
            }
            if(doiCho==false) break;
        }
    }

//    public static void bubbleSort(int[] a) {
//        int n = a.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1 - i; j++) {
//                if (a[j] > a[j + 1]) {
//                    // Hoán đổi 2 phần tử
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            }
//        }
//    }

    public static void nhapMang(int[] x) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Nhập phần tử tử x[%d]=", i);
            x[i] = sc.nextInt();
        }
    }

    public static void inMang(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}

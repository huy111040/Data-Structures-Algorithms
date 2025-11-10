import java.util.Arrays;

public class MyQuickSort {
    public static void main(String[] args) {
        int[] a = {5, 10, 1, 9, 8, 15, 2};
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[]a,int l, int r){
        if(l>=r) return; //trường hợp có một phần tử thì dừng
        //tìm phần tử khoá: phần tử ở giữa
        int mid=(l+r)/2;
        int key=a[mid];
        //phân bố lại mảng theo phần tử khoá
        //dùng hai biến i chạy từ hai đầu
        int iL=l,iR=r;
        while(iL<=iR){
            //tìm hai phần tử không đúng vị trí ở hai phía để đổi chỗ
            while(a[iL]<key){ //đúng vị trí thì dịch sang phải
                iL++;
            }
            while(a[iR]>key){ //đúng vị trí thì dịch sang trái
                iR--;
            }
            //tìm được 2 phần tử không đúng vị trí và đổi chỗ
            if(iL<=iR){
                //đổi chỗ
                int tam=a[iL];
                a[iL]=a[iR];
                a[iR]=tam;
                iL++; iR--; //dịch sang trái,phải
            }
        }
        //chia mảng ban đầu thành 2 mảng con l->iL-1; iL->R
        quickSort(a, l, iL-1);
        quickSort(a, iL, r);
    }
}

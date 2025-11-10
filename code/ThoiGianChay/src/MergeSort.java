//import java.util.Arrays;
//
//public class MergeSort {
//    public static void main(String[] args) {
//        //int[] a1={1,3,5,10};
//        //int[] a2={2,5,6};
//        int[] a3={2,10,7,25,3,2};
//        //int[] a=merge(a1, a2);
//        //System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(a3));
//        System.out.println(Arrays.toString(sortArray(a3)));
//    }
//    //trộn hai mảng đã sắp xếp
//    public static int[] merge(int[] a1,int[] a2){
//        //tạo mảng để lưu kết quả
//        int n=a1.length+a2.length;
//        int[] result=new int[n];
//        int i=0,i1=0,i2=0;
//        //hai mảng đều khác rỗng
//        while(i<n)
//        {
//            if(i1<a1.length && i2<a2.length) //hai mảng đều có phần tử
//                if(a1[i1]<=a2[i2])
//                {
//                    result[i]=a1[i1];
//                    i++;
//                    i1++;
//                }
//                else
//                {
//                    result[i]=a2[i2];
//                    i++;
//                    i2++;
//                }
//            else if(i1<a1.length){ //mảng a1 còn phần tử, a2 hết phần tử
//                result[i]=a1[i1];
//                i++;
//                i1++;
//            }
//            else{
//                result[i]=a2[i2];
//                i++;
//                i2++;
//            }
//
//
//        }
//        return result;
//    }
//
//    public static int[] mergeSort(int[] a,int l,int r){
//        //chia ra
//        if(l>r) return new int[0]; //trả về mảng rỗng
//        if(l==r) //mảng 1 phần tử, dừng đệ quy
//        {
//            int[] singleElement={a[l]};
//            return singleElement;
//        } //mảng có một phần tử trả về chính nó
//        //System.out.printf("Chia %d -> %d%n",l,r);
//        int mid=(l+r)/2;
//        int[] a1=mergeSort(a,l,mid);
//        int[] a2=mergeSort(a,mid+1,r);
//        //trộn lại
//        int[] kq=merge(a1,a2);
//        System.out.println("Kết quả trộn: "+Arrays.toString(kq));
//        return kq;
//    }
//    public static int[] sortArray(int[] a){
//        return mergeSort(a, 0, a.length-1);
//    ?
//}

import java.util.Arrays;
import java.util.Scanner;

public class arrayproblem1 {
    public static void swap(int []ar,int i,int j)
    {
        int t=ar[i];
        ar[i]=ar[j];
        ar[j]=t;
    }
    public static void partition(int [] ar,int end)
    {

        int start=0,mid=0;
         int pivot=1;
         while(mid<=end) {
             if (ar[mid] < pivot) {
                 swap(ar, start, mid);
                 start++;
                 mid++;
             }
             if (ar[mid] > pivot) {
                 swap(ar, mid, end);
                 end--;
             } else {
                 mid++;
             }
         }


    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int [] ar={0,1,2,2,1,0,0,2,0,1,1,0};
        partition(ar,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }
}

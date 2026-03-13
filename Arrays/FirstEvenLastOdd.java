import java.util.Arrays;
import java.util.Scanner;
public class FirstEvenLastOdd{
    public static void segregateEvenOdd(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            while (arr[lo] % 2 == 0 && lo < hi)
                lo++;
            while (arr[hi] % 2 == 1 && lo < hi)
                hi--;
            if (lo < hi) {
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                lo++;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        segregateEvenOdd(arr);
        System.out.println("Array after segregation: " + Arrays.toString(arr));
    }
}
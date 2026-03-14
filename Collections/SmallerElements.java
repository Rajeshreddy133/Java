import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SmallerElements{
    public static List<Integer>
    findSmallerElements(int[] arr, int K)
    {
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num < K) {
                result.add(num);
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Elements to Array :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the  k value :");
        int K=sc.nextInt();
        List<Integer> smallerElements
            = findSmallerElements(a, K);
        System.out.println("Elements smaller than " + K + ": " + smallerElements);
    }
}
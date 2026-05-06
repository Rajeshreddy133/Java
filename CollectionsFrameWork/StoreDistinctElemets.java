import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;
public class StoreDistinctElemets{
    public static ArrayList<Integer> removeDuplicate(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) {
                s.add(arr[i]);
                v.add(arr[i]);
            }
        }
        return v;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the Size Of The Array :");
        int n=sc.nextInt(); 
        int[] arr =new int[n];
        System.out.println("Eneter the elements to Array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> res = removeDuplicate(arr);
        for (int ele : res)
            System.out.print(ele + " ");
    }
}
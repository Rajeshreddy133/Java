import java.util.*;
import java.util.Arrays;
class CommonElements{
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer>result=new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                result.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of First array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements to array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the Second Array : ");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("enter the elements to array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(commonElements(a,b));
    }
}
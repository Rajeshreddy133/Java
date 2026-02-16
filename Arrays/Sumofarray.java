import java.util.*;
class Sumofarray{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements to Array : ");
        int sum=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
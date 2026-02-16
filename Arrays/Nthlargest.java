import java.util.*;
public class Nthlargest{
    public void sort(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Nthlargest nl=new Nthlargest();
    System.out.println("Eneter the size of Array :");
    int n=sc.nextInt();
    System.out.println("enter the Nth number : ");
    int N=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the Elements to Array : ");
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    nl.sort(a,n);
    System.out.println(N+"in the array is"+a[N]);
 }
}

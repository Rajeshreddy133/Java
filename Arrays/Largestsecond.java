import java.util.Scanner;
public class Largestsecond{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(a[i]>largest){
                second=largest;
                largest=a[i];
            }
            else if(a[i]>second && a[i]!=largest){
                second=a[i];
            }
        }
        System.out.println("largest Number is "+largest);
        System.out.println("Second Number is "+second);
    }
}
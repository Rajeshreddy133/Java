import java.util.Scanner;
class Missingnum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        System.out.println("Enter the elements to array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Enter the Number of elements : ");
        int N=sc.nextInt();
        int firstsum=N*(N+1)/2;
        System.out.println((firstsum-sum));
    }
}
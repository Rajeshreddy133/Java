import java.util.Scanner;
class SmallestSecond{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n=sc.nextInt();
        System.out.println("Enter the Elements to Array : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<smallest){
                secondsmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<secondsmallest && a[i]!=smallest){
                secondsmallest=a[i];
            }
        }
        System.out.println("Smallest Element is : "+smallest);
        System.out.println("Second Smallest Element is : "+secondsmallest);
    }
}

import java.util.Scanner;
class Kpattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                 System.out.print("*");
            }
            if(i==n)
            {
                break;
            }
            System.out.println();
        }
        for(int i=2;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
}
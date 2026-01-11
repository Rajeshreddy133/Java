import java.util.Scanner;
class Butterflypattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
              System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=n-i;k>0;k--){
                System.out.print(" ");
            }
            for(int l=n-i;l>0;l--){
                System.out.print(" ");
            }
            for(int m=i;m>0;m--){
              System.out.print("*");
          
            }
            System.out.println();
        }
    }
}
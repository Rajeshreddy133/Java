import java.util.Scanner;
class Diamond{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the Number of Rows : ");
          int i=0;
          while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=(2*i)-1){
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
          }
          i=n-1;
          while(i>0){
            int j=n-i;
            while(j>0){
                System.out.print(" ");
                j--;
            }
            int k=(2*i)-1;
            while(k>0){
                System.out.print("*");
                k--;
            }
            i--;
            System.out.println();
          }
    }
}
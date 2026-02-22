import java.util.Scanner;
class Hollowdiamond{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Rows : ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            System.out.print("*");
            int k=1;
            while(k<=(i-1)*2){
                System.out.print(" ");
                k++;
            }
            i++;
            System.out.print("*");
            System.out.println();
        }
    }
}
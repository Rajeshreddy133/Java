import java.util.Scanner;
class FloidDiamond{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int value=1;
        while(i<=n){
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            int k=1;
            while(k<=(2*i)-1){
                System.out.print(value+" ");
                k++;
                value++;
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
                System.out.print(value+" ");
                k--;
                value++;
            }
            i--;
            System.out.println();
        }
    }
}
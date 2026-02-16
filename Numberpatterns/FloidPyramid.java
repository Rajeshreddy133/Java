import java.util.Scanner;
class FloidPyramid{
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
    }
}
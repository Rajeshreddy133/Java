import java.util.Scanner;
class FloidTriangle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int value=1;
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(value+" ");
                value++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
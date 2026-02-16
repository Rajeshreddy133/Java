import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                
                if(j<=n-i){
                    System.out.print("* ");
                }
                else{
                     System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
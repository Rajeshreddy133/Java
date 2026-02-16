import java.util.Scanner;
class HollowSquare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                if((j!=0 && j!=n-1) && (i!=0 && i!=n-1))
                {
                //if((i==2 &&j==1)||(i==1&&j==2)||(i==2&&j==2)||(i==1&&j==1)){
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
    
            System.out.println("");
        }
    }
}
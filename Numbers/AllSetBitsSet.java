import java.util.Scanner;
public class AllSetBitsSet {
    public static boolean isSetBitsSet(int n){
        if(n==0){
            return false;
        }
        while(n>0){
            if((n&1)==0){
                return false;
            }
            n=n>>1;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        System.out.println(isSetBitsSet(n));
    }
}

import java.util.Scanner;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(Prime(num)){
            System.out.println(num+"is a prime number");
        }
        else{
            System.out.println(num+"is not a prime number");
        }
    }
    public static boolean Prime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }return true;
    }
}
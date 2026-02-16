import java.util.Scanner;
class Primenum{
    public static boolean isprime(int n){
        for(int j=2;j<n;j++){
            if(n%j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number the terms");
        int num=sc.nextInt();
        for(int i=2;i<=num;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }

    }
}
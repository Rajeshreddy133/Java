import java.util.Scanner;
class AutomorphicNumber{
    public static boolean isAutomorphic(int n){
        int squaredigit=(n*n)%10;
        n=n%10;
        if(n==squaredigit){
            return true;
        }
        return false; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isAutomorphic(n)){
            System.out.println(n+"is a Automorphic Number");
        }
        else{
            System.out.println(n+"is not a Automorphic Number");
        }
    }
}
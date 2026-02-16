import java.util.Scanner;
class Twistedprime{
    public static boolean istwistedprime(int n){
        int a=0;int b=0;
        for(int i=2;i<n/2;i++){
            if(n%i!=0){
                a=1;
            }
        }
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n=n/10;
        }
        for(int j=2;j<rev/2;j++){
            if(rev%j!=0){
                b=1;
            }
        }
        return a==b? true:false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(istwistedprime(num)){
            System.out.println(num+"is a Twisted prime number");
        }
        else{
            System.out.println(num+"is not a Twisted prime number");
        }
    }
}
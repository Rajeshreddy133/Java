import java.util.Scanner;
class Neonnumber{
    public static int isneon(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int square=num*num;
        int sum=isneon(square);
        if(num==sum){
            System.out.println(num+"is a Neon Number");
        }
        else{
            System.out.println(num+"is not s Neon number");
        }
    }
}
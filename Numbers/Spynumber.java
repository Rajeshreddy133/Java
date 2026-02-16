import java.util.Scanner;
class Spynumber{
    public static boolean isspynum(int n){
        int sum=0;
        int prod=1;
        while(n!=0){
            int digit=n%10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }
        return sum==prod? true:false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isspynum(num)){
            System.out.println(num+"is a SPY number");
        }
        else{
            System.out.println(num+"is not SPY number");
        }
    }
}
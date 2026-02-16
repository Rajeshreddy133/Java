import java.util.Scanner;
class HarshadNumber{
    public static boolean isHarshadnum(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        return n%sum==0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isHarshadnum(n)){
            System.out.println(n+"is a Harshad Number");
        }
        else{
            System.out.println(n+"is not a Harshad Number");
        }
    }
}
import java.util.Scanner;
class HappyNumber{
    public static boolean isHappy(int n) {
       while(n!=1 && n!=4){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        n=sum;
       }
       return n==1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isHappy(num));
    }
}

import java.util.Scanner;
 class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;int arm=0;
        int powers=String.valueOf(num).length();
        while(temp!=0){
            int digit=temp%10;
            arm+=Math.pow(digit,powers);
            temp/=10;
        }
        if(arm==num){
            System.out.println(num+"is a Armstrong number");
        }else{
            System.out.println(num+"is not a Armstrong number");
        }
    }
}
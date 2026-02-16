import java.util.Scanner;
class Sunnynum{
    public static boolean issunny(int num){
        int nextnum=num+1;
        for(int i=0;i*i<=nextnum;i++){
            if(i*i==nextnum){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(issunny(num)){
            System.out.println(num+" is a sunny number");
        }
        else{
            System.out.println(num+" is not a sunny number");
        }
    }
}
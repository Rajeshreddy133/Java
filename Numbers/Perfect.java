import java.util.Scanner;
class Perfect{
    public static boolean isperfect(int n){
        int count=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count+=i;
            }
        }return n==count? true:false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isperfect(num)){
            System.out.println(num+"is a perfect number");
        }
        else{
            System.out.println(num+"is not a perfect number");
        }
    }
}
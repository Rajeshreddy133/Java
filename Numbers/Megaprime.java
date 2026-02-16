import java.util.Scanner;//examples of mega prime numbers=23,37,53,73,223
class Megaprime{
    public static boolean isprime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
             return false;
            }
        }return true;
    }
    public static boolean ismegaprime(int num){
        if(!isprime(num)){
            return false;
        }
        int temp=num;
        while(temp>0){
            int digit=num%10;
            if(!(digit == 2 || digit ==3 || digit ==5 || digit==7)){
                return false;
            }
            temp/=10;
        }return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(ismegaprime(num)){
            System.out.println(num+"is s Mega prime Number");
        }
        else{
            System.out.println(num+"is not a Mega prime Number");
        }
    }
}
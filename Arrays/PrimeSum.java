import java.util.Scanner;
class PrimeSum{
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements to array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(isPrime(a[i])){
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
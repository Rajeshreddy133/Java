import java.util.Scanner;
class PowerOfTwo{
    public static  boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPowerOfTwo(n)){
            System.out.println(n+" is a Power of Two ");
        }else{
            System.out.println(n+" is Not a Power of Two ");
        }
    }
}
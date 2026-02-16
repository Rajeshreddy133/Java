import java.util.*;
import java.math.BigInteger;
class BigIntegerFactorial{
     static BigInteger fact(int n){
        BigInteger f=new BigInteger("1");
        for(int i=1;i<=n;i++){
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
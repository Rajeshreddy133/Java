import java.util.*;
import java.math.*;
public class BigIntegerNextProbable{
    static long nextPrime(long n){
        BigInteger b=new BigInteger(String.valueOf(n));
        return Long.parseLong(b.nextProbablePrime().toString());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(nextPrime(n));
    }
}
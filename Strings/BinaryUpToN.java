import java.util.*;
public class BinaryUpToN{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            if(i==0){
                sb.append("0");
            }else{
                int num=i;
                while(num>0){
                    sb.append(num%2);
                    num/=2;
                }
            }
            sb.reverse();
            System.out.println(sb);
        }
    }
}
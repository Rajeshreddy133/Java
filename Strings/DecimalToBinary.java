import java.util.Scanner;
class DecimalToBinary{
    public static String toBinary(int n) {
        // Code here
        StringBuilder sb=new StringBuilder();
        while(n>0){
            if(n%2==1){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
            n/=2;
        }
        sb=sb.reverse();
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(toBinary(n));
    }
}
import java.util.Scanner;

public class Largest3SameDigitString{
    public static String largestGoodInteger(String num) {
        int n=num.length();
        int max=Integer.MIN_VALUE;
        String str="";
        for(int i=2;i<n;i++){
            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2)){
                str=num.substring(i-2,i+1);
                max=Math.max(max,Integer.parseInt(str));
            }
        }
        if(max<0){
            return "";
        }
        if(max==0){
            return "000";
        }
        str=Integer.toString(max);
        return str;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        String str=sc.nextLine();
        System.out.println(largestGoodInteger(str));
    }
} 
import java.util.Scanner;
class BinaryToDecimal{
    public static int toDecimal(String b) {
        // Code here
        int j=1;int ans=0;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                ans+=j;
            }
            j*=2;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        System.out.println(toDecimal(s));
    }
}
import java.util.*;
class Count_1_Bits{
    public static int[] countBits(int n) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<=n;i++){
            String binary=toBinary(i);
            int count=countOf(binary);
            list.add(count);
        }
        int m=list.size();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=list.get(i);
        }
        return a;
    }
    public static String toBinary(int n){
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n/=2;
        }
        return sb.toString();
    }
    public static int countOf(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n=sc.nextInt();
        int a[]=countBits(n);
        for(int x:a){
            System.out.print(x+" ");
        }
    }
}

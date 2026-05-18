import java.util.Scanner;

class ShortestDistanceToCharacter{
    public static int[] shortestToChar(String s, char c) {
        int n=s.length();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int count=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if (s.charAt(j) == c) {
                    count= Math.min(count, Math.abs(i - j));
                }
            }
            a[i]=count;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String s=sc.nextLine();
        System.out.println("Eneter the Target Character : ");
        char c=sc.next().charAt(0);
        int result[]=shortestToChar(s,c);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}

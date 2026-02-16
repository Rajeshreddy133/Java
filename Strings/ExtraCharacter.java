import java.util.*;
class ExtraCharacter{
    public static char extraChar(String s1, String s2) {
        char a1[]=s1.toCharArray();
        char a2[]=s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int n=a1.length;
        for(int i=0;i<n;i++){
            if(a1[i]!=a2[i]){
                return a2[i];
            }
        }
        return a2[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
       System.out.println(extraChar(s1,s2));
    }
}

import java.util.Scanner;

class IsSubSequence{
    public static  boolean isSubsequence(String s, String t) {
        int i=0;int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
            
        }
        return i==s.length();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
       System.out.println(isSubsequence(s1,s2));
    }
}

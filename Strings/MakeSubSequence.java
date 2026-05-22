import java.util.Scanner;

class MakeSubSequence{
    public static int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        int i=0,j=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return m-j;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        System.out.println("Length Of Append Characters To Make s2 By s1 : "+appendCharacters(s,t));
    }
}
import java.util.Scanner;
class Panagram {
    public static boolean isPanagram(String str) {
        int n=str.length();
        if(n<26){
            return false;
        }
        boolean visited[]=new boolean[26];
        for(int i=0;i<n;i++){
            char x=str.charAt(i);
            if(x>='a' && x<='z'){
                visited[x-'a']=true;
            }
            if(x>='A' && x<='Z'){
                visited[x-'A']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPanagram(s)){
            System.out.println(s+" is a Panagram");
        }
        else{
            System.out.println(s+" is not a panagram");
        }
    }
}

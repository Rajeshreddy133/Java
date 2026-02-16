import java.util.*;
class PatternFind{
    public static int findPattern(String s, String p) {
        int position=-1;
        if(s.contains(p)){
            position=s.indexOf(p);
        }
        return position;
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String p=sc.nextLine();
       System.out.println(findPattern(s,p));
    }
}

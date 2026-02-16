import java.util.*;
class PatternSearching{
    public static void patSearch(String str,String txt){
        int pos=str.indexOf(txt);
        while(pos>=0){
            System.out.println(pos+"");
            pos=str.indexOf(txt,pos+1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String txt=sc.nextLine();
        patSearch(str,txt);
    }
}
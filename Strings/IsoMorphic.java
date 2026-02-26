import java.util.Scanner;
public class IsoMorphic{
    public static boolean areIsomorphic(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
        int[]map1=new int[26];
        int[]map2=new int [26];
        for(int i=0;i<26;i++){
            map1[i]=-1;
            map2[i]=-1;
        }
        for(int i=0;i<s1.length();i++){
            int c1=s1.charAt(i)-'a';
            int c2=s2.charAt(i)-'a';
            if(map1[c1]==-1 && map2[c2]==-1){
                map1[c1]=c2;
                map2[c2]=c1;
            }
            else{
               if(map1[c1]!=c2 || map2[c2]!=c1){
                  return false;
               }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(areIsomorphic(s1,s2)){
            System.out.println(s1+" and "+s2+" are Isomorphic Strings");
        }
        else{
            System.out.println(s1+" and "+s2+" are Not Isomorphic Strings");
        }
    }
}
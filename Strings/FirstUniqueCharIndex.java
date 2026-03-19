import java.util.Scanner;
class FirstUniqueCharIndex{
    public static  int firstUniqChar(String s) {
       int freq[]=new int[26];
       for(int i=0;i<s.length();i++){
           freq[s.charAt(i)-'a']++;
       }
       for(int i=0;i<s.length();i++){
          if(freq[s.charAt(i)-'a']==1){
            return i;
          }
       }
       return-1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        System.out.println("First Unique Charecter Index is "+firstUniqChar(s));
    }
}

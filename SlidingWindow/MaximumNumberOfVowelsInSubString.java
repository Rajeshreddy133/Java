import java.util.Scanner;
public class MaximumNumberOfVowelsInSubString {
    public static boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public static int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        int maxV=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        maxV=count;
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxV=Math.max(maxV,count);
        }
        return maxV;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String s=sc.nextLine();
        System.out.println("Eneter the SubString Length : ");
        int k=sc.nextInt();
        System.out.println(maxVowels(s,k));
    }
}

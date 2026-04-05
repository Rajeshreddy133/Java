import java.util.Scanner;
public class SwapVowels {
    public static String swap(String s){
        char a[]=s.toCharArray();
        int right=s.length()-1;
        int left=0;
        while(left<right){
            char x=Character.toLowerCase(a[left]),y=Character.toLowerCase(a[right]);
            if(isVowel(x) && isVowel(y)){
                a[left]=y;
                a[right]=x;
                left++;
                right--;
            }else if(isVowel(x) && !isVowel(y)){
                right--;
            }else{
                left++;
            }
        }
        return new String(a);
    }
    public static boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String s=sc.nextLine();
        System.out.println("Before Swapping String is : "+s);
        System.out.println("After Swapping of Vowels : "+swap(s));
    }
}

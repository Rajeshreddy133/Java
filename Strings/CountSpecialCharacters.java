import java.util.Scanner;

public class CountSpecialCharacters{
    public static int numberOfSpecialChars(String word) {
        int count=0;
        for(char ch ='a';ch<='z';ch++){
            if(word.indexOf(ch)!=-1 && word.indexOf(Character.toUpperCase(ch))!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(numberOfSpecialChars(s));
    }
} 

import java.util.Scanner;
class DetectCapital{
    public static boolean detectCapitalUse(String word) {
         int capitals = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitals++;
            }
        }
        return capitals == word.length() || capitals == 0 || (capitals == 1 && Character.isUpperCase(word.charAt(0)));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(detectCapitalUse(s));
    }
}
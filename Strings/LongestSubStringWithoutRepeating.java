import java.util.*;
public class LongestSubStringWithoutRepeating{
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char x = s.charAt(right);
            while (set.contains(x)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(x);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
}

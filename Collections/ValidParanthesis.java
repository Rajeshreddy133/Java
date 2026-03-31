import java.util.Stack;
import java.util.Vector;
import java.util.Scanner;
public class ValidParanthesis{
    public static boolean isBalanced(String s) {
       
        Stack<Character> st = new Stack<>();
       
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) return false; 
                char top = st.peek();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
                st.pop(); 
            }
        }
        return st.isEmpty(); 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println((isBalanced(s) ? "true" : "false"));
    }
}
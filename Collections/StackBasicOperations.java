import java.util.Stack;
public class StackBasicOperations{
    public static void main(String[] args){
        Stack<Integer>s=new Stack<>();
        s.push(35);
        s.push(46);
        s.push(45);
        s.push(25);
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
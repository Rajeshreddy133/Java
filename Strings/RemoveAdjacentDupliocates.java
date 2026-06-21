import java.util.Scanner;
import java.util.Stack;
public class RemoveAdjacentDupliocates {
    class Adjacent{
            char ch;
            int count;
            public Adjacent(char ch,int count){
                this.ch=ch;
                this.count=count;
            }
        }
    public String removeDuplicates(String s, int k) {
        Stack<Adjacent>stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch == ch){
                stack.peek().count++;
                if(stack.peek().count==k){
                    stack.pop();
                }
            }else{
                stack.push(new Adjacent(ch,1));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(Adjacent p:stack){
            while (p.count-- > 0) {
                sb.append(p.ch);
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        RemoveAdjacentDupliocates r=new RemoveAdjacentDupliocates();
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String s=sc.nextLine();
        System.out.println("Enter the occurrence size : ");
        int k=sc.nextInt();
        System.out.println(r.removeDuplicates(s,k));
    }

}

import java.util.*;
class AsteriodCollision{
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                
                if (stack.peek() < -a) {
                    stack.pop(); 
                } else if (stack.peek() == -a) {
                    stack.pop(); 
                    a = 0;
                } else {
                    a = 0;
                }
            }

            if (a != 0) {
                stack.push(a);
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }

        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n=sc.nextInt();
        System.out.println("Eneter the Elements To Array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result[]=asteroidCollision(arr);
        for(int x : result){
            System.out.println(x+" ");
        }
    }
}
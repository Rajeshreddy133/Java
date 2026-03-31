import java.util.*;
class ReverseArrayUsingStack{
    static void reverseArray(int arr[])
    {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(arr[i]);
        }
        int i = 0;
        while (st.empty() == false) {
            int top = st.peek();
            st.pop();
            arr[i] = top;
            i++;
        }
        return;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        reverseArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
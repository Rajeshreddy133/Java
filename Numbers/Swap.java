public class Swap{
    public static void main(String args[]){
        int a=376;
        int b=345;
        int temp=a;a=b;b=temp;
        a^=b;b^=a;a^=b;
        System.out.println(a+" "+b);
    }
}
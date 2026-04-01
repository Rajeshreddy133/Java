import java.util.Scanner;
class BinaryStringCount{
    public static int countStrings(int n) {
        if (n == 1) return 2;
        if (n == 2) return 3;

        int prev2 = 2; 
        int prev1 = 3; 

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2; 
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value (Max String length):");
        int n=sc.nextInt();
        System.out.println(countStrings(n));
    }
}
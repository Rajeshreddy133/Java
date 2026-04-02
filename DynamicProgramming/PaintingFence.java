package DynamicProgramming;
import java.util.Scanner;
class PaintingFence{
    public static int countWays(int n, int k) {
        if (n == 1) return k;
        if (n == 2) return k * k;
        int same = k;
        int diff = k * (k - 1);
        for (int i = 3; i <= n; i++) {
            int newSame = diff;
            int newDiff = (same + diff) * (k - 1);

            same = newSame;
            diff = newDiff;
        }
        return same + diff;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  posts : ");
        int n=sc.nextInt();
        System.out.println("Enter the number of Colors : ");
        int k=sc.nextInt();
        System.out.println(countWays(n,k));
    }
}

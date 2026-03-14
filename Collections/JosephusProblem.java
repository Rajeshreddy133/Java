import java.util.Scanner;
public class JosephusProblem{
  public static int josephus(int N, int k) {
    int i = 1, ans = 0;
    while (i <= N) {
      ans = (ans + k) % i;
      i++;
    }
    return ans + 1;
  }
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The N Value :");
    int N = sc.nextInt();
    System.out.println("Enter the K Value : ");
    int k =sc.nextInt();
    int ans = josephus(N, k);
    System.out.println(ans);
  }
}
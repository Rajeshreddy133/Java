import java.util.Scanner;
class TwoEqualSumSubArrays{
    public static boolean canSplit(int n,int arr[]) {
         int total = 0;
        for (int i = 0; i < n; i++)
            total += arr[i];

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            int rightSum = total - leftSum;
            if (leftSum == rightSum)
                return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the size of Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements to array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(canSplit(n,a));
    }
}
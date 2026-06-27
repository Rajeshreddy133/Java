import java.util.Scanner;
public class MaximunAverageSubArray {
    public static double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int subSum=0;
        for(int i=0;i<k;i++){
            subSum+=nums[i];
        }
        int maxSum=subSum;
        for(int i=k;i<n;i++){
            subSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,subSum);
        }
        return (double)maxSum/k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n=sc.nextInt();
        System.out.println("Enter the Elements To Array : ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Eneter the SubArray Size : ");
        int k=sc.nextInt();
        System.out.println(findMaxAverage(arr,k));
    }
}

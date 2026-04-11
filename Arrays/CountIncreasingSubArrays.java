import java.util.Scanner;
class CountIncreasingSubArrays{
    public static  int countIncreasing(int[] arr) {
        int n = arr.length;
        int len = 1;   
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                len++;
            } else {
                count += (len * (len - 1)) / 2;
                len = 1;
            }
        }
        count += (len * (len - 1)) / 2;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Count of Increasing Sub Array  is :"+countIncreasing(arr));
    }
}

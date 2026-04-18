import java.util.Scanner;

class FlipToMaximize1s{
    static int maxSumSub(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ans = Math.max(ans, sum);
            if (sum < 0) sum = 0;
        }
        
        return ans;
    }
    public static int maxOnes(int[] arr) {
        int n = arr.length;
        
        int oneCnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                arr[i] = -1;
                oneCnt++;
            } else arr[i] = 1;
        }
        int maxDiff = maxSumSub(arr);
        return oneCnt + maxDiff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxOnes(arr));
    }
}
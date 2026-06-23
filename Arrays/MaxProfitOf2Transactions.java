import java.util.Scanner;

public class MaxProfitOf2Transactions{

    public static int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 0) {
            return 0;
        }

        int[] left = new int[n];
        int[] right = new int[n];
        int minPrice = prices[0];

        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            left[i] = Math.max(left[i - 1], prices[i] - minPrice);
        }
        int maxPrice = prices[n - 1];

        for (int j = n - 2; j >= 0; j--) {
            maxPrice = Math.max(maxPrice, prices[j]);
            right[j] = Math.max(right[j + 1], maxPrice - prices[j]);
        }
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            maxProfit = Math.max(maxProfit, left[i] + right[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the prices to arry :");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(maxProfit(a));
    }
}
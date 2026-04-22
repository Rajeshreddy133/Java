import java.util.*;
class MeanOfRange{
    public static ArrayList<Integer> findMean(int[] arr, int[][] queries) {
       int n = arr.length;
        int q = queries.length;
        ArrayList<Integer> result = new ArrayList<>();
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }
        for (int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int sum = prefixSum[r + 1] - prefixSum[l];
            int count = r - l + 1;
            result.add(sum / count);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of The Array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of Ranges :");
        int m=sc.nextInt();
        int queries[][]=new int[m][2];
        System.out.println("Eneter the elements to queries Array :");
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
                queries[i][j]=sc.nextInt();
            }
        }
        System.out.println("floor values of that mean are : "+findMean(arr,queries));
    }
}
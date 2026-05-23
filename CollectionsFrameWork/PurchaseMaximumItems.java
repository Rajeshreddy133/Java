import java.util.*;
class PurchaseMaximumItems{
    static int maxItems(int[] cost, int sum) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : cost) {
            pq.add(x);
        }
        int count = 0;
        while (!pq.isEmpty() && sum >= pq.peek()) {
            sum -= pq.poll();
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the Number of Items : ");
        int n=sc.nextInt();
        int[] cost = new int[n];
        System.out.println("Enter the items : ");
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        System.out.println("Enter the maximum Sum : ");
        int sum =sc.nextInt();
        System.out.println(maxItems(cost, sum));
    }
} 

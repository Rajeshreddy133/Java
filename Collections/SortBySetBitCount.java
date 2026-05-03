import java.util.*;
class SortBySetBitCount{
    static int countBits(int n)
    {
        int cnt = 0;
        while (n > 0) {
            cnt += (n & 1);
            n = n >> 1;
        }
        return cnt;
    }
    static ArrayList<Integer> sortBySetBitCount(int[] arr,int n) {
        ArrayList<ArrayList<Integer> > count = new ArrayList<>();

        for (int i = 0; i < 32; i++) {
            count.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int setBit = countBits(arr[i]);
            count.get(setBit).add(arr[i]);
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 31; i >= 0; i--) {
            ArrayList<Integer> curr = count.get(i);
            for (int k = 0; k < curr.size(); k++) {
                res.add(curr.get(k));
            }
        }

        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size  of Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Eneter the Elements to array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sortBySetBitCount(arr,n));
    }
}
import java.util.*;
class KthLargestElementInStream{
    public static ArrayList<Integer> kthLargest(int[] arr, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        PriorityQueue<Integer>q=new PriorityQueue<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(q.size()<k){
                q.add(arr[i]);
            }
            else if(arr[i]>q.peek()){
                q.poll();
                q.add(arr[i]);
            }
            if(q.size()==k){
                list.add(q.peek());
            }
            else{
                list.add(-1);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int k=4;
        System.out.println(kthLargest(arr,k));
    }
}
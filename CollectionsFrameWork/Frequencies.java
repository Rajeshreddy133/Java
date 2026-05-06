import java.util.*;
class Frequencies{
    public static ArrayList<Integer> frequencyCount(int[] arr) {
        LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(Integer x :arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry : hm.entrySet()){
          list.add(entry.getValue());
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter the elements tio array ;");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(frequencyCount(nums));
    }
}
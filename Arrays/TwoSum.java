import java.util.Scanner;
class TwoSum{
    public static  int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    a[0]=i;
                    a[1]=j;
                }
            }
        }
        return a;
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
        System.out.println("Enter the target element :");
        int target=sc.nextInt();
        int result[]=twoSum(nums,target);
        for(int x:result){
            System.out.println(x+" ");    //it will peint the indexes which the values present in 
                                          //that indexes will give the target value
        }
    }
}
import java.util.Scanner;

class ZeroFilledSubArrays{
    public static long zeroFilledSubarray(int[] nums,int n) {
        int i=0;
        long count=0;
        long result=0;
        while(i<n){
            if(nums[i]==0){
                count++;
            }else{
                result+=(count*(count+1))/2;
                count=0;
            }
            i++;
        }
        result+=(count*(count+1))/2;
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the size of Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements To Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Buildings with SunLight are : "+zeroFilledSubarray(a,n));
    }
}
import java.util.Scanner;
class ZerosToEnd{
    static void pushZerosToEnd(int[] arr,int n) {
        int nonZeroIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[nonZeroIndex++]=arr[i];
            }
        }
        while(nonZeroIndex<n){
            arr[nonZeroIndex++]=0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements To Array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Eneter the Elements to array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pushZerosToEnd(arr,n);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
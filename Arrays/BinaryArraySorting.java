import java.util.*;

class BinaryArraySorting{
    public static void binSort(int[] arr,int n) {
        int index=0;
        int i=0;
        for(i=0;i<n;i++){
            if(arr[i]==0){
                arr[index++]=arr[i];
            }
        }
        for(int j=index;j<n;j++){
            arr[j]=1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        binSort(arr,n);
        System.out.println("Array after sorting : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

import java.util.Scanner;
class Segregate0sAnd1s{
    public static void segregate0and1(int[] arr,int n) {
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[index++]=arr[i];
            }
        }
        while(index<n){
            arr[index++]=1;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of The Array : ");
        int n=sc.nextInt();
        System.out.println("Enter the o's And 1's to Array : ");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        segregate0and1(a, n);
        System.out.println("After the Segrgation :");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}

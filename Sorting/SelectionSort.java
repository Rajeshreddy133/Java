import java.util.Scanner;
class SelectionSort{
    static void sort(int a[],int n){
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[minindex]){
                    minindex=j;
                }
            }
            int temp=a[minindex];
            a[minindex]=a[i];
            a[i]=temp;
        }
        for(int x:a){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a,n);
    }
}
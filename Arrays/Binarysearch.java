import java.util.Scanner;
class Binarysearch{
    public static int bsearch( int n,int a[],int key){
        int low=0;int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==key){
              return mid;
            }
            else if (key<a[mid]){
              high=mid-1;
            }
            else{
              low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Binarysearch bs=new Binarysearch();
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements to array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array is :");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("enter the key element to search : ");
        int key=sc.nextInt();
        int value= bsearch(n,a,key);
        if(value==-1){
            System.out.println("element not found ");
        }
        else{
            System.out.println("element is  found at index : "+value);
        }
    }
}
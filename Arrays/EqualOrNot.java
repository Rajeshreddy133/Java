import java.util.*;
class EqualOrNot{
    public static void bubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={3,5,7,2,8,9};
        int b[]={5,3,8,7,9,2};
        bubbleSort(a);
        bubbleSort(b);
        if(Arrays.equals(a,b)){
            System.out.println("TWo Arrays ara equals");
        }
        else{
            System.out.println("Two Arrays are Not Equals");
        }
    }
}
import java.util.*;
class Heighestsumoftwo{
    public static void main(String args[]){
        //{2,3,5,6,7}
        int arr[]={2,3,5,6,7};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])>max){
                    max=arr[i]+arr[j];
                }
            }
        }
        System.out.println(max);
    }
}
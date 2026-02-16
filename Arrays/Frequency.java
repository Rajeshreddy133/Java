import java.util.*;
public class Frequency{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements to array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=1;j<n;j++){
                if(a[i]==a[j]){
                    count+=1;
                }
            }
            System.out.println("Frequency of "+a[i]+"is "+count);
        }
    }
}
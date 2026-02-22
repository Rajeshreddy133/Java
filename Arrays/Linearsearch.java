import java.util.Scanner;
public class Linearsearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        int foundindex=-1;
        System.out.println("enter the elements to arry :");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter  the element to search :");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(a[i]==key){
                foundindex=i;
                break;
            }
        }
        if(foundindex !=-1){
            System.out.println("element "+key+" is found at index "+foundindex);
        }
        else{
            System.out.println("element "+key +" is not find in the array");
        }
    }
}
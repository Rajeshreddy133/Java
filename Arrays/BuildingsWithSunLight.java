import java.util.Scanner;
class BuildingsWithSunLight{
    public static int visibleBuildings(int arr[],int n) {
        int sum=1;int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>=max){
                max=arr[i];
                sum++;
            }
        }
        return sum;
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
        System.out.println("Buildings with SunLight are : "+visibleBuildings(a,n));
    }
}
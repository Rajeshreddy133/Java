import java.util.*;
class MeetingRooms{
    static boolean canAttend(int[][] arr) {
        if(arr==null || arr.length<=1){
            return true;
        }
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0],b[0]));
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<arr[i-1][1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the Size Of Array : ");
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        System.out.println("Enter the Elememts to Arrray : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(canAttend(arr));
    }
}

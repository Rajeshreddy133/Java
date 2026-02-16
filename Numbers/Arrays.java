import java.util.*;
class Arrays{
    public static void main(String args[]){
        int nums[]={2,3,4,5,6,};
        for(int n : nums){
            System.out.print(n+" ");
        }
        int arr[][]=new int[3][4];
        int random=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.println(m+" ");
            }
            System.out.print();
        }
    }
}
import java.util.*;
class ColumnSum{
    public static int[] colSum(int mat[][]) {
        int list[]=new int[mat[0].length];
        for(int i=0;i<mat[0].length;i++){
            int sum=0;
            for(int j=0;j<mat.length;j++){
                sum+=mat[j][i];
            }
            list[i]=sum;
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows : ");
        int n=sc.nextInt();
        System.out.println("Enter the number of Columns : ");
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        System.out.println("Enter the elements to array : ");
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println(colSum(mat));
    }
}
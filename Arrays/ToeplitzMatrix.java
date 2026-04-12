import java.util.Scanner;
public class ToeplitzMatrix{
    public static boolean isToeplitzMatrix(int mat[][]){
        int m=mat.length;
        int n=mat[0].length;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(mat[i][j]!=mat[i-1][j-1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Rows :");
        int n=sc.nextInt();
        System.out.println("Enter the size of Columns :");
        int m=sc.nextInt();
        System.out.println("Enter the Elements to Array :");
        int mat[][]=new  int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        if(isToeplitzMatrix(mat)){
            System.out.println("Given matrix is a Toeplitz Matrix");
        }else{
            System.out.println("Given matrix is not a Toeplitz Matrix");
        }
    }
}
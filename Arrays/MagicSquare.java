import java.util.*;
class MagicSquare{
    public static String magicSquare(int mat[][]) {
        // Code here
        int n=mat.length;
        int nSquared=n*n;
        boolean[]seen=new boolean[nSquared+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=mat[i][j];
                if(num<1 || num>nSquared || seen[num]){
                    return "Not a Magic Square";
                }
                seen[num]=true;
            }
        }
        int magicSum=n*(nSquared+1)/2;
        for(int i=0;i<n;i++){
            int rowSum=0;
            for(int j=0;j<n;j++){
                rowSum+=mat[i][j];
            }
            if(rowSum!=magicSum){
                return "Not a Magic Square";
            }
        }
        
        for(int j=0;j<n;j++){
            int colsum=0;
            for(int i=0;i<n;i++){
                colsum+=mat[i][j];
            }
            if(colsum!=magicSum){
                return "Not a Magic Square";
            }
        }
        int diag1=0;
        for(int i=0;i<n;i++){
            diag1+=mat[i][i];
        }
        if(diag1!=magicSum){
            return "Not a Magic Square";
        }
        int diag2=0;
        for(int i=0;i<n;i++){
            diag2+=mat[i][n-1-i];
        }
        if(diag2!=magicSum){
            return "Not a Magic Square";
        }
        return "Magic Square";
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of Rows : ");
        int n=sc.nextInt();
        System.out.println("Enter the no.of Columns : ");
        int m=sc.nextInt();
        System.out.println("Enter the elements to Array : ");
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println(magicSquare(a));
    }
}
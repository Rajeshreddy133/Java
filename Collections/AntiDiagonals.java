import java.util.*;
class AntiDiagonals{
    static ArrayList<Integer> diagView(int mat[][]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = mat.length; 
        for (int sum = 0; sum <= 2 * (n - 1); sum++) {
            for (int i = 0; i < n; i++) {
                int j = sum - i;
                if (j >= 0 && j < n) {
                    result.add(mat[i][j]);
                }
            }
        }
        return result;
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
        System.out.println(diagView(a));
    }
}

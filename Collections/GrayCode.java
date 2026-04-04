import java.util.*;
class GrayCode{
    public static ArrayList<String> graycode(int n) {
         ArrayList<String> result = new ArrayList<>();
        int size = 1 << n;
        for (int i = 0; i < size; i++) {
            int gray = i ^ (i >> 1);
            result.add(toBinary(gray, n));
        }
        
        return result;
    }
     private static String toBinary(int num, int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = n - 1; i >= 0; i--) {
            if ((num & (1 << i)) != 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        
        return sb.toString();
    }
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  posts : ");
        int n=sc.nextInt();
        System.out.println(graycode(n));
    }

}
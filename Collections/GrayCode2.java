import java.util.*;

class GrayCode2{
    public static List<String> grayCode(int n) {
        List<String> result = new ArrayList<>();
        result.add("0");
        result.add("1");
        for (int i = 2; i <= n; i++) {
            int size = result.size();
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j));
            }
            for (int j = 0; j < size; j++) {
                result.set(j, "0" + result.get(j));
            }
            for (int j = size; j < result.size(); j++) {
                result.set(j, "1" + result.get(j));
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  posts : ");
        int n=sc.nextInt();
        System.out.println(grayCode(n));
    }

}
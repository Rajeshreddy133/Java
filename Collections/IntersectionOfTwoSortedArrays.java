import java.util.*;
class IntersectionOfTwoSortedArrays{
    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        if(hs.contains(b[0])){
            list.add(b[0]);
        }
        for(int i=1;i<b.length;i++){
            if(hs.contains(b[i]) && b[i]!=b[i-1]){
                list.add(b[i]);
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of First Array : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Eneter the elements To Array : ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter The Size Of Second  Array : ");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("Eneter the elements To Array : ");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(intersection(a,b));
    }
}
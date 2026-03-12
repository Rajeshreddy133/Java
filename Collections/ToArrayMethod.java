import java.util.*;

public class ToArrayMethod{
    public static void main(String[] args)
    {
        ArrayList<Integer> ArrList = new ArrayList<Integer>();
        ArrList.add(32);
        ArrList.add(67);
        ArrList.add(98);
        ArrList.add(100);
        System.out.println("ArrayList: " + ArrList);
        Object[] arr = ArrList.toArray();
        System.out.println("Elements of ArrayList"+ " as Array: "+ Arrays.toString(arr));
    }
}
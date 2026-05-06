import java.util.ArrayList;
public class ArrayListBasicOperations{
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(19);
        list.add(34);
        list.add(54);
        list.add(456);
        System.out.println(list.remove(1));
        System.out.println(list.get(0));
    }
}
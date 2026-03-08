import java.util.LinkedList;
public class LinkedListBasicOperations{
    public static void main(String[] args){
        LinkedList<Integer>list=new LinkedList<>();
        list.add(35);
        list.add(563);
        list.add(24);
        list.add(72);
        System.out.println(list.size());
        System.out.println(list.remove(3));
        System.out.println(list.get(2));
    }
}
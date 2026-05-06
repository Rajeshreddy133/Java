import java.util.*;
class MyDS {
    LinkedList<Integer> list = new LinkedList<>();
    void add(int x) {
        list.add(x);
    }
    void removeAndPrint(int x) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            if (n.equals(x)) {
                it.remove();
            } else {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
public class RemoveElementAndPrint{
    public static void main(String[] args) {
        MyDS ds = new MyDS();
        ds.add(10);
        ds.add(20);
        ds.add(10);
        ds.add(30);
        ds.removeAndPrint(10); 
        ds.add(30);
        ds.add(40);
        ds.add(60);
        ds.removeAndPrint(30); 
    }
} 

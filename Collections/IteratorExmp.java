import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExmp{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");
        Iterator<String> it = al.iterator();
        while (it.hasNext()) {
            String n = it.next(); 
            System.out.println(n);      
        }
    }
}
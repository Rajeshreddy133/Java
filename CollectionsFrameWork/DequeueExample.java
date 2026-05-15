import java.util.ArrayDeque;
import java.util.Deque;
public class DequeueExample{
    public static void main(String[] args){
        Deque<String> d = new ArrayDeque<>();
        d.addFirst("1");
        d.addLast("2");
        String f = d.removeFirst();
        String l = d.removeLast();
        System.out.println("First: " + f + ", Last: " + l);
    }
}

import java.util.*;
public class ArrayDequeIteration{
    public static void main(String[] args)
    {
        Deque<String> dq = new ArrayDeque<>();
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("is so good");
        for (Iterator<String> itr = dq.iterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        for (Iterator<String> itr = dq.descendingIterator();
             itr.hasNext();) {
            System.out.print(itr.next() + " ");
        }
    }
}

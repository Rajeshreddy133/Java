import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteration
{
    public static void main(String[] args) 
    {
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Z");
        System.out.print("Using iterator : ");
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");

        System.out.println();
        System.out.print("Using enhanced for loop : ");
        for (String element : hs)
            System.out.print(element + " , ");
    }
} 

import java.util.*;

class BasicHashSetOperations
{
    public static void main(String[] args)
    {
      
        HashSet<String> hs = new HashSet<>();
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");
        hs.add("A");
        hs.add("B");
        hs.add("Z");

        System.out.println("HashSet : " + hs);
        hs.remove("B");
        System.out.println("HashSet after removing element : " + hs);
        System.out.println("B exists in Set : " + hs.remove("B"));
    }
}

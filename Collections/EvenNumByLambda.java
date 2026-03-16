import java.util.ArrayList;
public class EvenNumByLambda{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("All elements:");
        list.forEach(n -> System.out.println(n));
        System.out.println("Even elements:");
        list.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}
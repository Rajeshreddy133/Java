import java.io.*;
import java.util.*;

class AverageOfArray{
    public static void main(String[] args)
    {
        int arr[] = { 30, 20, 10 };
        double avg= Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);
    }
}
import java.io.*;
import java.util.*;
import java.util.stream.*;

class NNumContainsGivenDigit{
    public static void main(String[] args) {
        Stream.iterate(1, x -> x + 1)
            .filter(x -> x.toString().contains("5"))
            .limit(10)
            .forEach(System.out::println);
    }
}
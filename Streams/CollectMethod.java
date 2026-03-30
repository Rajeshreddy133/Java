import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Student {
    int roll;
    int marks;
    String name;

    Student(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
    }

    int getRoll() {
        return roll;
    }

    String getName() {
        return name;
    }

    int getMarks() {
        return marks;
    }
}

class CollectMethod{
    public static void main(String[] args) {
        Student arr[] = {
            new Student(110, "abc", 70),
            new Student(101, "bcd", 80),
            new Student(120, "xyz", 60)
        };
        
        Map<Integer, String> m = Arrays.stream(arr)
            .collect(Collectors.toMap(Student::getRoll, Student::getName));
        
        for (Map.Entry<Integer, String> ent : m.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
        }
    }
}
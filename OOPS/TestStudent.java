class Student {
    int id;
    String n;

    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Alice");
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}
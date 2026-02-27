class Person{
    String name;
    int Age;
    public Person(String name,int Age){
        this.name=name;
        this.Age=Age;
    }
    void displayPerson(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+name);
    }
}
class Employee extends Person{
    double salary;
    public Employee(String name,int Age,double salary){
        super(name,Age);
        this.salary=salary;
    }
    void displayEmployee(){
        displayPerson();
        System.out.println("Salary :"+salary);
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Employee emp1=new Employee("Steve",28,23453.9);
        Employee emp2=new Employee("Mike",21,34352.4);
        emp1.displayEmployee();
        emp2.displayEmployee();
    }
}

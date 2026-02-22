class Person{
    private String name;
    private int Age;
    public String getName(){ 
        return name; 
    }
    public int getAge(){
        return Age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.Age=age;
    }
}
public class Encapsulation{
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Siddarth");
        p.setAge(17);
        System.out.println("Name : " + p.getName());
        System.out.println("Age :"+p.getAge());
    }
}
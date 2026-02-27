class Vehicle{
    void run(){
        System.out.println("This is a Vehicle");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("This car Vehicle is running With Two Wheels");
    }
}
class Car extends Vehicle{
    void run(){
        System.out.println("This is Car Vehicle is running With Four Wheels");
    }
}
public class HeiraricalInheritance{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        v.run();
        v=new Car();
        v.run();
        v=new Bike();
        v.run();
    }
}
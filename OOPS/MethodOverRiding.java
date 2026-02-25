import java.util.*;
class Vehicle{
    void start(){
        System.out.println("Vehicle is Running");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike is Running with Two Wheels");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is Running Four Wheels");
    }
}
public class MethodOverRiding{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        v.start();
        v=new Bike();
        v.start();
        v=new Car();
        v.start();
    }
}
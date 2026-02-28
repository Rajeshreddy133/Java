class Vehicle{
    void start(){
        System.out.println("Vehicle is Running");
    }
}
class Bike extends Vehicle{
    String bikeType;
    public Bike(){

    }
    public Bike(String type){
        bikeType=type;
    }
    void start(){
        System.out.println("Bike is Running With Engine : "+bikeType);
    }
}
class ElectricBike extends Bike{
    int capacity;
    public ElectricBike(int capacity){
        this.capacity=capacity;
    }
    void start(){
        System.out.println("Bike is Running With Electric Engine : "+capacity);
    }
}
public class MultiLevelInheritance{
    public static void main(String[] args){
        ElectricBike eb=new ElectricBike(354647);
        eb.start();
        Bike b=new Bike("Suzuki");
        b.start();
    }
}
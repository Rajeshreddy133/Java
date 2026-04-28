interface Vehicle{
    static void displayVehicle(){
        System.out.println("This is a Vehicle ");
    }
}
interface FourWheeler{
    default void displayFourWheeler(){
        System.out.println("This is a Four Wheeler Vehicle ");
    }
}
class Car implements Vehicle,FourWheeler{
    void displayCar(){
        System.out.println("This is car ");
    }
} 
public class MultipleInheritance {
    public static void main(String[] args){
        Car car=new Car();
        Vehicle.displayVehicle();
        car.displayFourWheeler();
        car.displayCar();
    }
}

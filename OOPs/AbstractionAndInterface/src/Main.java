interface Drivability{
    void drive();
}

abstract class Vehicle {
    String fuelType;

    public Vehicle(String fuelType) {
        this.fuelType = fuelType;
    }
    // Non-abstract method (common behavior)
    void refuel() {
        System.out.println("Refueling with " + fuelType);
    }

    // Abstract method (subclasses must implement this)
    abstract void move();
}

class ElectricCar extends Vehicle implements Drivability{

    ElectricCar(){
        super("Electricity");
    }
    @Override
    void move() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        
    }
    
}

class ManualCar extends Vehicle implements Drivability{

    ManualCar(){
        super("Gasoline");
    }
    @Override
    void move() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void drive() {
        // TODO Auto-generated method stub
        
    }
    
}
public class Main {
    public static void main(String[] args) {
        
    }
}

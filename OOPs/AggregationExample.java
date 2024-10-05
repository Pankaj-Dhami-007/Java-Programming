class Driver {
    String name;
    public Driver(String name){
        this.name = name;
    }
}

class Car {
    String carModel;
    Driver driver;

    public Car(String carModel, Driver driver) {
        this.carModel = carModel;
        this.driver= driver;
    }
     void showCarDetail(){
        System.out.println("Car model : "+carModel);
        System.out.println("Driver name : "+driver.name);
     }
}

public class AggregationExample {
    public static void main(String[] args) {
        Driver d = new Driver("Dhami");
     Car myCar = new Car("Tesla", d);
     myCar.showCarDetail();
    }
}

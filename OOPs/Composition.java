class Car{
  String model;
  Engine engine;
public Car(String model, String engineType) {
    this.model = model;
    this.engine = new Engine(engineType);// Composition: Car has an Engine
}
public String getCarDetails(){
    return "Car with "+engine.getType()+"engine";
}
  
}

class Engine{
   String Type;
   
   public Engine(String type) {
    this.Type = type;
}

String getType(){
    return Type;
   }
}

public class Composition {
    public static void main(String[] args) {
        Car c = new Car(null, "E5");
        System.out.println(c.getCarDetails());
        
    }
}

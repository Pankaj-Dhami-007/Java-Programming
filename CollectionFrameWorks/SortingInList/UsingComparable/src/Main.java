import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 100000));
        cars.add(new Car("BMW", 80000));
        cars.add(new Car("Duster", 60000));

        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

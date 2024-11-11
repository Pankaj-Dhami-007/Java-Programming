import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class CarPriceComparator implements Comparator<Car>{

    @Override
    public int compare(Car c1, Car c2) {
        
       // Sort cars by price (ascending order)
       return Integer.compare(c1.price, c2.price);

    }
    
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", 80000));
        cars.add(new Car("Ford", 30000));
        cars.add(new Car("BMW", 60000));

        Collections.sort(cars, new CarPriceComparator());
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

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

/*
 Difference Between Comparable and Comparator:
Comparable is used to define the natural ordering of objects (only one sort sequence per class).
Comparator is used for custom sorting. You can create multiple comparators to sort objects differently.


With Comparator, you don’t need to modify the class itself to define sorting behavior. This is useful when you can't or don’t want to modify the class you're working with.



Integer.compare() is a method in Java that is used to compare two integer values. It returns an integer value indicating the comparison result. This method is often used for sorting or comparing integers.
The method works by comparing the two integers (x and y) and returning a value based on their comparison:
If x == y, the method returns 0.
If x < y, the method returns -1 (meaning x is smaller).
If x > y, the method returns 1 (meaning x is greater).
 */

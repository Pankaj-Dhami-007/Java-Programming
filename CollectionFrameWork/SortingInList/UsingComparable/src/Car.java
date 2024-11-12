public class Car implements Comparable<Car> {
    String model;
    int price;
    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Car [model=" + model + ", price=" + price + "]";
    }


    @Override
    public int compareTo(Car c1) {
        // Compare cars based on price (ascending order)
        // return Integer.compare(this.price, other.price);
        return this.price - c1.price;
    }
    
    
}

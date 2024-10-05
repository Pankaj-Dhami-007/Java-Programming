// rent a Car

class Car {
    private String carId;
    private String brand;
    private String model;
    private double basePricePerDay;
    private boolean isAvailable;

    public Car(String carId, String brand, String model, double basePricePerDay, boolean isAvailable) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.basePricePerDay = basePricePerDay;
        this.isAvailable = isAvailable;
    }

    public String getCarId() {
        return carId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double calculatePrice(int rentalDays) {
        return basePricePerDay * rentalDays;
    }

    public void rent() {

    }

    public void returnCar() {

    }
}

class Customer {
    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

}

class Rental {
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car, Customer customer, int days) {
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getDays() {
        return days;
    }

}

public class Encap {
    public static void main(String[] args) {
        // Customer c = new Customer("101_Alpha", "Dhami");
        // System.out.print("CustomerId : "+c.getCustomerId()+" CustomerName :
        // "+c.getCustomerName());

        Car car1 = new Car("C001", "Toyota", "Camry", 60.0, true);
        Car car2 = new Car("C002", "Honda", "Accord", 70.0, true);
        Car car3 = new Car("C003", "Mahindra", "Thar", 150.0, false);

    }
}

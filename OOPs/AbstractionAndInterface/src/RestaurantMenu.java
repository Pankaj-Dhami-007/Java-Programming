// interface MenuItem {
//     String getName();          
//     double getPrice();         
//     String getDescription();   
//     void displayItem();       
// }

class Appetizer {
    private String name;
    private double price;
    private String description;

    public Appetizer(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDiscription() {
        return description;
    }
    public void displayItem() {
        System.out.println(name + " - $" + price + ":     " + description);
    }

}



public class RestaurantMenu {
    public static void main(String[] args) {
        Appetizer springRoll = new Appetizer("Springroll", 330, "Crispy  rolls with vegetable filling");
        springRoll.displayItem();
    }
}

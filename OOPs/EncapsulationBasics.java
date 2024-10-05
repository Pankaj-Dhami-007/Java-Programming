/*
 Why Encapsulation?
The goal of encapsulation is to protect an object’s internal state from unwanted changes and to control how the data is accessed and modified. It ensures that the internal details of an object are hidden from the outside world, which is known as data hiding.

It involves hiding the internal details of the class and controlling access to it through methods (getters and setters).


How Encapsulation Works Together with Other OOP Concepts:
                  Encapsulation ensures that the object's internal state is protected and only accessible in a controlled way.
                  Abstraction hides the complexity of the system by showing only what is necessary. Encapsulation helps achieve abstraction.
                  Inheritance and polymorphism work with encapsulation to allow code reuse and flexibility while keeping data safe.


Real life examples : 
          You can turn the TV on or off, change the volume, and switch channels, but you don't need to know how the TV works inside.
 */

// ex. 1
class Person{
    String name;
    private int age;

    public void setAge(int age){
        if(age> 0){
            this.age = age;
        }
        else{
            System.out.println("Invalid Age..");
        }
    }
    public int getAge(){
    return age;
 }

}
//ex.. 2-->
class BankAccount{
    private double balance;
    // Constructor to initialize the balance
     BankAccount(double initialBalance){
        if(initialBalance > 0){
            balance = initialBalance;
        }
        else{
            balance =0;
        }
     }
     public void deposit(double amount){
             if(amount > 0){
                balance+=amount;// Update the balance
             }
             else{
                System.out.println("");
             }
     }
     public double getBalance(){
        return balance;// Return the current balance
     }

}
public class EncapsulationBasics {
    public static void main(String[] args) {

        // Person p = new Person();
        // //System.out.println(p.name);
        // p.setAge(22);
        // System.out.println(p.getAge());

    BankAccount ac = new BankAccount(0);
    double x = ac.getBalance();
    System.out.println("Current Balance is : "+x);
    ac.deposit(500);
    System.out.println("Current Balance is : "+ac.getBalance());
    }
}

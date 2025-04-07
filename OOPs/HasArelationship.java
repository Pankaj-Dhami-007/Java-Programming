/*
Association
      association is just a way to say that two things are connected but don't need each other to live.
      Association refers to a relationship between two or more objects where they work together or are linked in some way, but neither depends on the other to exist. It's like a loose connection between objects
         Example:
         Imagine a Teacher and a Student.

          A teacher teaches a student and a student learns from a teacher, but:
          A teacher can exist without a student.
          A student can exist without a teacher.
           This is association — they are linked but independent.

           Example in Real Life:
            A doctor and a patient:
            A doctor treats a patient, and the patient sees the doctor, but they don't need to stay together all the time. Each can live separately.

Association is when two things are linked but can still stand on their own. They are friends, but one doesn’t need the other to exist.
        Key Points:
         Connected: They can help each other.
         Independent: Each one can exist without the other.
         No ownership: One doesn’t control the other.

types ----->>
      
Type of Association	Definition	Example

Unidirectional   	One object knows another.	                      Student → Teacher
Bidirectional   	Both objects know each other.	 
                  Teacher ↔ Student
Aggregation   	Part of another, but both can exist alone.	            Library has Books
Composition   	Stronger connection; parts cannot exist alone.	         House has Rooms
Dependency   	One object needs another for functionality.	           Car depends on Engine


 In object-oriented programming, a "has-a" relationship refers to composition or aggregation, where one object contains or is composed of another object. This is different from an "is-a" relationship (inheritance), where one class is a subclass of another.

 In the context of your code, the Company class has a Department object, which means that the Company class exhibits a "has-a" relationship with the Department class. Here's a breakdown of the "has-a" relationship:

A "has-a" relationship means that one class contains an instance of another class as one of its fields (instance variables).

In your case, a Company object "has a" Department object, signifying that a company contains or is associated with a department.

Composition vs. Aggregation (Simplified)--->>

       Both composition and aggregation describe "has-a" relationships between objects, but they differ in how tightly the objects are connected.

       1. Composition:
What it means: One object depends on the other. If the main object is destroyed, the part inside it is destroyed too.
Example: Think of a car and its engine.
The engine is part of the car. If the car is destroyed, the engine goes with it.
In programming terms, the Company would create its own Department. If the company is deleted, the department also disappears.

        2. Aggregation:
What it means: One object doesn't depend on the other. If the main object is destroyed, the part inside can still exist on its own.

Example: Think of a school and its students.

Even if the school closes, the students still exist and go elsewhere.
In your code, the Department is created separately, outside the Company. Even if the Company is deleted, the Department still exists.

Easy Difference:
Composition: Strong connection — if one is destroyed, the other is too.
Aggregation: Weaker connection — one can live without the other.
In your code, it's aggregation because the Department can exist even if the Company is gone.




*** "Is-a" Relationship (Inheritance)
Definition: The "is-a" relationship represents inheritance, where a subclass is a more specific version of a superclass. The subclass inherits properties and behaviors (methods) from the superclass.

Key Feature: One class inherits from another.


***"Has-a" Relationship (Composition/Aggregation)
Definition: The "has-a" relationship means that one class contains or is associated with another class. It can be through composition (strong dependency) or aggregation (weaker dependency).

Key Feature: One class contains or uses another class as part of its structure.


*** Dependency
Dependency refers to a "uses-a" relationship where one object uses another object, but doesn't necessarily own it. The dependent object is passed in as a parameter, and its lifecycle is independent of the dependent class.

Example of Dependency:
Let's say a Mechanic class depends on a Car to fix it. The Mechanic "uses a" Car, but the mechanic does not own or contain the car.
class Mechanic {
    public void fixCar(Car car) {
        // Dependency: Mechanic uses Car, but does not own it
        System.out.println("Fixing the car with engine: " + car.getCarDetails());
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("V8");
        Mechanic mechanic = new Mechanic();
        mechanic.fixCar(car);  // Mechanic uses Car to perform the operation
    }
}

 */

 class Department {
    String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }
}

class Company {
    String companyName;
    Department department;

    public Company(String companyName, Department department) {
        this.companyName = companyName;
        this.department = department;
    }

    public void display() {
        System.out.println("Company: " + companyName + ", Department: " + department.deptName);
    }
}

public class HasArelationship {
    public static void main(String[] args) {
     Department d = new Department("Engineering");
     Company c = new Company("Google", d);
     c.display();
    }
}

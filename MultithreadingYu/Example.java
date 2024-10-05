/*
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

public class Example {
    public static void main(String[] args) {
     Department d = new Department("Engineering");
     Company c = new Company("Google", d);
     c.display();
    }
}

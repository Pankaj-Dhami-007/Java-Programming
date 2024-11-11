/*
 In Java, the toString() method is used to return a string representation of an object. It is a method inherited from the Object class, which is the superclass of all Java classes. By default, the toString() method returns the class name followed by the "@" symbol and the object's hashcode, but it can be overridden in a class to provide a more meaningful representation of the object.


 */

import java.time.LocalDate;
import java.util.ArrayList;

class Employee {
    Integer id;
    String name;
    String email;
    LocalDate dob;

    public Employee() {

    }

    public Employee(Integer id, String name, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
    }       
}

public class ToString_Method {
    public static void main(String[] args) {
    Employee emp = new Employee(101, "Dhami", "dhami@gmail.com",LocalDate.of(1999,7,7));

    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(new Employee(102, "Shami", "shami@gmail.com",LocalDate.of(1999,7,7)));

    System.out.println("All Employees Details:");
    for (Employee employee : employees) 
    {
        System.out.println(employee);
    }

    //System.out.println(emp.toString());
    }
}

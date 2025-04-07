import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Employee{
    int id;
    String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        
        return "Employee {" + "id=" + id + ", name='" + name + '\'' + '}';
    }
    
}
public class Student implements Comparable<Student> {
     int rollNo;
     String name;
     
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

   

    @Override
    public int compareTo(Student o) {
        
        return this.rollNo- o.rollNo;
    }



    @Override
    public String toString() {
        
        return  "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }



    public static void main(String[] args) {

        // List<Integer> rollNo = Arrays.asList(11,1,33,711);
        // Collections.sort(rollNo);

        // for (Integer integer : rollNo) {
        //     System.out.println(integer);
        // }

        // List<String> employees = Arrays.asList("Dhami", "Alice", "Bob", "John");
        // Collections.sort(employees);
        // for (String name : employees) {
        //     System.out.println(name);
        // }

        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "John"));
        students.add(new Student(101, "Alice"));
        students.add(new Student(103, "Bob"));

        Collections.sort(students);
         for (Student student : students) {
            System.out.println(student);
         }

        //  for (int i = 0; i < students.size(); i++) {
        //     System.out.println(students.get(i));
        //  }

        // List<Employee> employeesList = new ArrayList<>();
        // List<Employee> employees = Arrays.asList(
        //     new Employee(201, "Dhami"),
        //     new Employee(202, "Alice"),
        //     new Employee(203, "Bob")
        // );






    }
}
//  A company needs to store employee details (e.g., name, department, and role) and retrieve this information      quickly using employee IDs. HashMap is perfect for this as it allows fast lookup by employee ID.

import java.util.HashMap;
import java.util.Map;

class Employee {
    int emp_id;
    String name;
    String dept_name;

    public Employee(int emp_id, String name, String dept_name) {
        this.emp_id = emp_id;
        this.name = name;
        this.dept_name = dept_name;
    }

}

class Company {

    HashMap<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmp(Employee newEmployee) {
        employeeMap.put(newEmployee.emp_id, newEmployee);
    }

    public void showEmployeeDetails() {
        System.out.println("=========* Employees Information *================");
        
        for (Map.Entry<Integer, Employee> e : employeeMap.entrySet()) {
            Employee emp = e.getValue();;
            System.out.println("Employee id : "+emp.emp_id);
            System.out.println("Employee Name : "+emp.name);
            System.out.println("Department Name : "+emp.dept_name);

        }
    }
}

public class HashMapExample {
    public static void main(String[] args) {
        Company mCompany = new Company();
        Employee emp1 = new Employee(101, "Dhami", "HR");
        Employee emp2 = new Employee(102, "Rishab", "CS");
        Employee emp3 = new Employee(103, "Shiva", "BeTech");

        mCompany.addEmp(emp1);
        mCompany.addEmp(emp2);
        mCompany.addEmp(emp3);

        mCompany.showEmployeeDetails();
    }
}

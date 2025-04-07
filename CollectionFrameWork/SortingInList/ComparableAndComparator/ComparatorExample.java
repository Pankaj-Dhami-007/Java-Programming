import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;  // Sort by roll number
    }
}


class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sorting by name in alphabetical order
        return s1.name.compareTo(s2.name);
    }
}

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + '}';
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student(102, "John"));
        students.add(new Student(101, "Alice"));
        students.add(new Student(103, "Bob"));


        // Comparator to sort by roll number
        // Comparator<Student> rollNoComparator = new Comparator<Student>() {
        //     @Override
        //     public int compare(Student s1, Student s2) {
        //         return s1.rollNo - s2.rollNo;  // Ascending order by roll number
        //     }
        // };

        // Comparator<Student> rollNoComparator = (s1, s2) -> s1.rollNo - s2.rollNo;
        Comparator<Student> rollNoComparator = (s1, s2) -> Integer.compare(s1.rollNo, s2.rollNo);;



        // Sorting by roll number
        Collections.sort(students, rollNoComparator);
        System.out.println("Sorted by roll number (Comparator):");
        for (Student student : students) {
            System.out.println(student);
        }




         // Sorting by roll number using RollNoComparator
         //Collections.sort(students, new RollNoComparator());
    }
}

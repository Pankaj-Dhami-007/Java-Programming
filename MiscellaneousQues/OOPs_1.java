class Course{
    private String courseName;
    
    public Course(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return courseName;
    }
    public void displayCourseDetails(){
        System.out.println("Course Name: "+courseName);
    }

    
}

class Student{
    private int id;
    private String name;
    private int age;
    private String address;
    private int dob;
    private Course course; // Student has a course
    public Student(int id, String name, int age, String address, int dob, Course course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.dob = dob;
        this.course = course;
    }
    public void displayStudentInfo(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("address: "+address);
        System.out.println("dob: "+dob);
        course.displayCourseDetails();
    }

}

public class OOPs_1 {
    public static void main(String[] args) {
        Course course = new Course("Java Programming");

        // Creating a Student object with the Course
        Student student = new Student(101, "Dhami", 25, "Gurugram", 01/07/1999, course);
         // Display student and course information
         student.displayStudentInfo();
    }
}

/*
 Key Distinctions to Keep in Mind:
Composition implies that the Student owns the Course, and if the Student is deleted, the Course tied to that specific student is deleted too.
Aggregation means that the Student and Course have a weaker association, where the Course can exist independently and be shared among multiple students.
 */

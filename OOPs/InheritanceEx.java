class Person {
    String name;
    int age;
    String gender;
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void showPersonDetails(){
           System.out.println("\t************Person Details****************");
           System.out.println("name: "+name);
           System.out.println("age: "+age);
           System.out.println("gender: "+gender);
    }
}


class Student extends Person {
    int id;
    String course;

    public Student(String name, int age, String gender, int id, String course) {
        super(name, age, gender);
        this.id = id;
        this.course = course;
    }

    @Override
    public void showPersonDetails() {
        super.showPersonDetails();
        System.out.println("Id: "+id);
        System.out.println("Course: "+course);

    }
    
}

public class InheritanceEx {
    public static void main(String[] args) {
     Student s1 = new Student("Dhami", 25, "Male", 101, "MCA");
     Student s2 = new Student("Ritik", 23, "Male", 102, "MCA");

     s1.showPersonDetails();
     s2.showPersonDetails();

    }
}

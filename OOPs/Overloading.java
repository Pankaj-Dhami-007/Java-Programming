class Student{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void studentInfo(){
        System.out.println("id: "+id);
        System.out.println("name: "+name);
    }
    public void studentInfo(int age){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name); 
        System.out.println("Age: "+age);
    }

    public void studentInfo(boolean showStudentID){
           if(showStudentID){
            System.out.println("ID: "+id);
           }
           else{
            System.out.println("Name: "+name);
           }
    }
}

public class Overloading {
    public static void main(String[] args) {
        Student student = new Student(101, "Joker");

        student.studentInfo();
        System.out.println();
        student.studentInfo(true);
        System.out.println();
        student.studentInfo(24);
    }
}

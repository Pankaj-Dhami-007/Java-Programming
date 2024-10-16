class Student{
    private static int idCounter;
    private int id;
    static{
    idCounter = 10000;
    }
    public Student() {
        this.id = idCounter++;
        if(idCounter > 99999){
            idCounter = 10000;
        }
    }
    public int getId() {
        return id;
    }    
}

public class StaticExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        System.out.println("Student 1 ID: " + s1.getId());
        System.out.println("Student 2 ID: " + s2.getId());
        System.out.println("Student 3 ID: " + s3.getId());
    }
}

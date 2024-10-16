class Student {
    private String s_id;
    private String s_name;
    private int s_age;

    public Student(String s_id, String s_name, int s_age) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_age = s_age;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public int getS_age() {
        return s_age;
    }

    public void setS_age(int s_age) {
        if (s_age > 0) {
            this.s_age = s_age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    public void showStudentDetails(){
        System.out.println("s_id: "+s_id);
        System.out.println("s_name: "+s_name);
        System.out.println("s_age: "+s_age);
        System.out.println("\n\n");
    }
}

public class EncapsulationStudentClass {
    public static void main(String[] args) {
     Student student = new Student("777", "Dhami", 23);

     student.showStudentDetails();
     student.setS_name("Mahesh");
     student.setS_age(44);

     student.showStudentDetails();

     student.setS_age(-23);
     System.out.println(student.getS_age());
    }
}

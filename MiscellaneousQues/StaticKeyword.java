class Student{
    int id;
    String name;
    static int roll_no;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    void disp(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
    }

    static{
        roll_no = 101;
        System.out.println("roll_no:"+roll_no);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student s = new Student(007, "Dhami");
        s.disp();
    }
}

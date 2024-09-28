public class StudentClass {
    public static class Student {

        int roll;
        String name;
        double percent;

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 10;
        s.name = "Dhami";
        s.percent = 55;
        System.out.println(s.name);
    }
}
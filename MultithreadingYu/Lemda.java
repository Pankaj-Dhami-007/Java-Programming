interface Student {
    public String getBio(String name);

}

// class EngineeringStudent implements Student {

//     @Override
//     public String getBio(String name) {
//         return name + " is a engineeringg Student";
//     }

// }

public class Lemda {
    public static void main(String[] args) {
    //  EngineeringStudent engineeringStudent = new EngineeringStudent();
    //  String str =engineeringStudent.getBio("Dhami");
    //  System.out.println(str);


    // Student engineeringStudent = new Student() {

    //     @Override
    //     public String getBio(String name) {
    //         return name+" is a engineering Student";
    //     }
        
    // };
     //String str = engineeringStudent.getBio("Dhami");
     //System.out.println(str);

    Student engineeringStudent = (name) -> name+ " is a engineering Student";

    String str = engineeringStudent.getBio("Dhami");
    System.out.println(str);

   }
}

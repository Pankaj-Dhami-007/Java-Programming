import java.util.*;

public class Xyz {

    static int test(Scanner sc) {
        System.out.println("Enter a no: ");
        int x = sc.nextInt();
        return x;
    }

    static int readInteger(Scanner sc) {
        System.out.println("Enter an Integer: ");
        return sc.nextInt();
    }

    static void inputStudentDetails(Scanner sc) {

        System.out.print("Enter student id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        sc.close();
        showStudentDetails(id, name);
    }

    static void showStudentDetails(int id, String name) {
        System.out.println("Id is : " + id);
        System.out.println("Name is : " + name);
    }

    public static void main(String[] args) {

        // System.out.println(test(sc));
        // System.out.println(readInteger(new Scanner(System.in)));
        inputStudentDetails(new Scanner(System.in));
    
    }
}

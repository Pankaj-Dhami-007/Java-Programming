import java.util.Scanner;

public class MultipleScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rooms: ");
        int noOfRooms = sc.nextInt(); // Reads an integer

        //sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter owner name: ");
        String ownerName = sc.nextLine(); // Now reads the full line properly

        System.out.println("noOfRooms: "+noOfRooms);
        System.out.println("ownerName: "+ownerName);

    }
}

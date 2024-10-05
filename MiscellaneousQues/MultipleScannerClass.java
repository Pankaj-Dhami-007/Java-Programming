import java.util.Scanner;

/*
 * Using sc.nextLine(); ensures that when you want to read a full line of text after reading numeric input, the nextLine() will work as expected.
 */
public class MultipleScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rooms: ");
        int noOfRooms = sc.nextInt(); // Reads an integer

        //sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter owner name: ");
        String ownerName = sc.nextLine(); // Now reads the full line properly

        System.out.println("noOfRooms: "+noOfRooms);
        System.out.println("ownerName: "+ownerName);

    }
}

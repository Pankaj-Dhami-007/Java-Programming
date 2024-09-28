/**
 * GetByteMethod
 * 
 * The getBytes() method in Java is used to convert a String into a byte array. This is particularly useful when you need to manipulate or store the byte representation of a string, such as when writing to a file or sending data over a network.
 */
public class GetByteMethod {

    public static void main(String[] args) {
        String originalString = "Hii , My name is Pankaj Singh Dhami";
        byte[] arr = originalString.getBytes();
        System.out.print("Original String: "+originalString);
        System.out.println("Byte Array: ");
        for(byte b : arr){
       System.out.print(b+" ");
        }
    }
}
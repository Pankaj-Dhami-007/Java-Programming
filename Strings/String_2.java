
//StringBuffer class
//String class creates immutable obj
//but StringBuffer class creates mutable obj
// immutable means that can not be changed
 
public class String_2 {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();// capacity by default is 16
        StringBuffer s2 = new StringBuffer("java");// capacity is 16+4= 20
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s2.capacity());
    }
}

/**
 * String :
 * In Java, SCP refers to String Constant Pool, a special memory region in the
 * Java heap that stores string literals to optimize memory usage and
 * performance. Here are the key benefits of SCP:
 * 
 * 1. Memory Efficiency
 * Reusability: When a string literal is created, it's placed in the String
 * Constant Pool. If the same string literal is used again, Java reuses the
 * existing string instead of creating a new one. This reduces memory
 * consumption.
 * Deduplication: By avoiding duplicate string objects for identical literals,
 * Java optimizes the use of memory.
 * 2. Performance Optimization
 * Faster Comparisons: Since all string literals with the same content point to
 * the same memory reference, checking string equality using the == operator is
 * faster, as it compares references rather than the content.
 * 3. Automatic Garbage Collection
 * String literals in SCP are automatically managed by the JVM. They are not
 * garbage collected until the JVM shuts down, so developers do not need to
 * worry about cleaning up string literals.
 * 4. Immutable Strings
 * Java strings are immutable. Once a string is created and placed in the SCP,
 * it cannot be altered, ensuring thread safety and preventing accidental
 * modifications to strings that could be shared across the application.
 * 
 */


public class StringBasics {
    public static void main(String[] args) {
                // String str="hello";// String literal

        // System.out.println(str instanceof String);
        // System.out.println(str.getClass());
        // System.out.println("".getClass());

        // // String s=new String();
        // String s=new String("hello");
        // System.out.println(s.getClass());

        // String s1 = "hello";// SCP -> string constant pool
        // String s2 = "hello";// SCP -> string constant pool

        // String s3 = new String("hello");// in heap memory
        // String s4 = new String("hello");// in heap memory

        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s3 == s4);


        String name="Aman";
        // String fullname=name.concat("tiwari");
        name=name.concat("tiwari");// re-initialize

        System.out.println(name);
        // System.out.println(fullname);
    }
}

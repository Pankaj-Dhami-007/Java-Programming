/*
 * Integer a = 100; // autoboxing
 *  int b = a;       // unboxing
 */

public class WrapperClass {
    static void checkEqualsMethod() {
        Integer a = 110;
        Integer b = 110;
        Integer c = 200;
        Integer d = 200;

        if (a.equals(b)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        if (c.equals(d)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }

    public static void main(String[] args) {
        Integer a = 110;
        Integer b = 110;
        Integer c = 200;
        Integer d = 200;
        if (a == b) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        if (c == d) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
// The value 110 is an int literal. However, since a is an Integer object, Java
// automatically converts the primitive int value to an Integer object through a
// process called autoboxing.

// Java caches Integer objects in the range of -128 to 127 for performance
// reasons. If you create an Integer in this range, Java reuses the same object
// instead of creating a new one.

/*
 * a == b: Same object (due to caching), so "Same" is printed.
 * c == d: Different objects (no caching), so "Different" is printed.
 * If you want to compare the values of a and b (or c and d), you should use
 * .equals() instead of ==.
 */

// The equals() ---> method in Java is used to compare the values of two
// objects, not their references.

/*
 Key Differences Between == and equals():
== compares references (whether two objects point to the same memory location).
equals() compares values (whether two objects are logically equivalent in terms of their content).
 */

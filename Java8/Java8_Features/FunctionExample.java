import java.util.function.Function;

public class FunctionExample {// kuch kaam kr ke dega
    public static void main(String[] args) {
    Function<Integer, Integer> doubleIt = x-> 2*x;
    Function<Integer, Integer> trippleIt = x-> 3*x;
    System.out.println(doubleIt.apply(200));

    // Function to convert a string to its length
    Function<String, Integer> findLength = x-> x.length();
    System.out.println(findLength.apply("Pankaj"));

    // Combine functions using andThen(): first double, then tripple
    Function<Integer, Integer> doubleThenTripple = doubleIt.andThen(trippleIt);
    System.out.println(doubleThenTripple.apply(100));

    // Combine functions using compose(): first triple, then double
    Function<Integer, Integer> tripleThenDouble = doubleIt.compose(trippleIt);
    System.out.println(tripleThenDouble.apply(100));
    }
}

/*
 Composing Functions:
In Java, Function also allows composition using the methods andThen() and compose().

andThen(): The result of the first function is passed as input to the second function.

Function 1 -> Function 2
f.andThen(g) is equivalent to g(f(x))
compose(): The second function is applied first, and its result is passed as input to the first function.

Function 2 -> Function 1
f.compose(g) is equivalent to f(g(x))
 */

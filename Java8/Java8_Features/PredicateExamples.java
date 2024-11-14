import java.util.function.Predicate;

public class PredicateExamples {// to check  (Condition hold)
    public static void main(String[] args) {
        Predicate<Integer> isEven = (x)-> x % 2 == 0;
        System.out.println(isEven.test(10)); 

        Predicate<String> isWordStartWithA = (x)-> x.toLowerCase().startsWith("a");
        Predicate<String> isWordEndWithT  = x-> x.toLowerCase().endsWith("t");
        System.out.println(isWordStartWithA.test("Ankit"));
        System.out.println(isWordEndWithT.test("Ankit"));
        

        // Combine predicates using and()
        Predicate<String> and = isWordStartWithA.and(isWordEndWithT);
        System.out.println(and.test("Ankit"));

        // Combine predicates using or()

         // Negate a predicate
    }
}


/*
 Use Cases of Predicate:
Filtering collections: As shown in the example, Predicate is often used in streams to filter lists based on conditions.
Validating inputs: In situations like form validation or business rules, Predicate can be used to evaluate whether an input meets certain criteria.
Composing conditions: By using and(), or(), and negate(), you can build complex conditions for evaluating objects.


How it works:
and(): Combines two predicates with a logical AND. Both conditions must be true for the combined predicate to return true.
or(): Combines two predicates with a logical OR. If either condition is true, the combined predicate will return true.
negate(): Reverses the result of a predicate, converting true to false and vice versa.

 */

import java.util.Arrays;
import java.util.List;


public class MethodReferenceConstructorReference {
    public static void main(String[] args) {
       //method Reference -->  in place of Lamda Expression
       List<String> students = Arrays.asList("Ram", "Shyam", "GhanShyam");
       students.forEach(x -> System.out.println(x));
       students.forEach(System.out :: println);

    }
}

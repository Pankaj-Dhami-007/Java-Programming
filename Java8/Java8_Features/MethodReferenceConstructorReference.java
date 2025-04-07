import java.util.Arrays;
import java.util.List;


public class MethodReferenceConstructorReference {
    public static void main(String[] args) {
       //method Reference -->  in place of Lamda Expression
       //You can use method references when you want to pass a method as an argument to a functional interface (like Consumer, Function, etc.) ex.......  ClassName::methodName

       List<String> students = Arrays.asList("Ram", "Shyam", "GhanShyam");
       students.forEach(x -> System.out.println(x));
       students.forEach(System.out :: println);


       //constructor reference     ---> both make code more concise and readable.
       //Instead of referring to a method, you're referring to a constructor, which is then invoked when the functional interface's method is called.
       //ex.........  ClassName::new



    }
}

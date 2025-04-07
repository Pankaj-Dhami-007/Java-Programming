import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermedediateOps {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Akshit", "Ram", "Shyam", "Ghanshyam");
        Stream<String> filterStream = list.stream().filter(x-> x.startsWith("A"));
        // no filtering at this point
        long res = list.stream().filter(x-> x.startsWith("A")).count();
        System.out.println(res);
        
    }
}

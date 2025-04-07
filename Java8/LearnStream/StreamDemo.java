import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // // count no of Even no 
        //  int count =0;
        //  for (Integer i : numbers) {
        //     if(i % 2 ==0){
        //         count++;
        //     }
        //  }
        //  System.out.println(count);

        //but using java Stream
        long res = numbers.stream().filter(x-> x %2 == 0).count();
        //System.out.println(res);


        //creating Streams
        // 1. FRom Collections
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        
        // 2. From Arrays
        String[] array = {"A", "B", "C", "D"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a", "b");

        // 4. Infinite streams 
        Stream<Integer> generate = Stream.generate(()-> 1);
        List<Integer> collect = Stream.iterate(1, x-> x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}

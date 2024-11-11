import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Aman");
        students.add("Adarsh");
        students.add("Ritik");
        students.add("Rahul");
        students.add("Mihir");

        // System.out.println(students);

        // for (int i = 0; i < students.size(); i++) {
        // String student = students.get(i);
        // System.out.println(student);
        // }

        // for (String string : students) {
        // System.out.println(string);
        // }

        // Iterator<String> irt = students.iterator();

        // while (irt.hasNext()) {
        // String student = irt.next();
        // System.out.println(student);
        // }

        // while (irt.hasNext()) {
        // String student = irt.next();
        // if(student.equals("Mihir")){
        // irt.remove();
        // }
        // }
        // System.out.println(students);

        // students.forEach(student ->{ // java 8
        // System.out.println(student);
        // });

        // students.forEach(System.out::println); // java 8

        // students.addAll(List.of("Ram","Shyam"));
        // students.addAll(Arrays.asList("raj","robin"));
        // students.addAll(new ArrayList<String>(Arrays.asList("Ammu","Rammu")));
        // students.forEach(System.out::println);

        // int arr[] = { 10, 20, 30, 40 };
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // List<Integer> data = Arrays.stream(arr).boxed().collect(Collectors.toList());
        // numbers.addAll(data);
        // numbers.forEach(System.out::println);



        // int[] arr = {1, 2, 3, 4, 5};
        // // Convert the int array to List<Integer> using Streams
        // List<Integer> data = Arrays.stream(arr) // Convert int[] to IntStream
        //         .boxed() // Box int to Integer
        //         .collect(Collectors.toList()); // Collect as List<Integer>

        // // Print the List
        // System.out.println(data);



        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Guava");
        boolean hasBanana = fruits.contains("Banana");
        System.out.println(hasBanana);


    
    }
}

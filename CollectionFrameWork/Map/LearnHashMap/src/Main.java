import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
    //   HashMapBasics basics = new HashMapBasics();
    //   basics.create();

    HashMap<Person, String> map = new HashMap<>();
    Person p1 = new Person("Alice", 1);
    Person p2 = new Person("Bob", 2);
    Person p3 = new Person("Alice", 1);

    
    map.put(p1, "Engineer");// hashcode1 --> index1
    map.put(p2, "Designer");// hashcode2 --> index2
    map.put(p3, "Manager");// hashcode3 --> index3

    Map<String, Integer> map1 = new HashMap<>();
    map1.put("Shubham", 98);// hashcode1 --> index1
    map1.put("Neha", 92);// hashcode2 --> index2
    map1.put("Shubham", 99);// hashcode1 --> index1 --> equals() --> replace


    // System.out.println("HashMap Size: "+map.size());
    // System.out.println("value for p1: "+map.get(p1));
    // System.out.println("value for p3: "+map.get(p3));

    System.out.println(p1+" : "+map.get(p1));
    System.out.println(p2);
    System.out.println(p3);
    }
}


/*
 The equals() method in Java is used to compare two objects for equality. It is defined in the Object class and is overridden by many Java classes to provide class-specific equality logic, such as in String, Integer, List, and custom classes.
 */

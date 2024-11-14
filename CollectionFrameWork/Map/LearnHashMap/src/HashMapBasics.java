import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public void create(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Ram");
        map.put(111, "Shyam");
        map.put(102, "Rohan");
        map.put(201, "Shivam");
        //System.out.println(map);

        String student = map.get(101);
        String s = map.get(31);
        //System.out.println(student);
        //System.out.println(s);

        // System.out.println(map.containsKey(s));
        // System.out.println(map.containsKey(101));

        //map.keySet();
        // Set<Integer> keys = map.keySet();
        // for (int i : keys) {
        //     System.out.print(map.get(i)+" ");
        // }

        // Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // for (Map.Entry<Integer,String> entry : entries) {
        //     System.out.println(entry.getKey()+" : "+entry.getValue());
        // }

        
    }
}

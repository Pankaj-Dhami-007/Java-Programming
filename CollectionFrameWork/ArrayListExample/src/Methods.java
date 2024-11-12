import java.util.ArrayList;
import java.util.Arrays;

public class Methods {
    public void methods(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(5);
        //System.out.println(list);
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.print(list.get(i)+" ");
        // }

        // for (Integer integer : list) {
        //     System.out.println(integer);
        // }

        //list.forEach(null);



        list.remove(1);
        list.remove(Integer.valueOf(0)); 
        //remove the first occurrence of the value 0 from the list, not the element at index 0
        // for (Integer integer : list) {
        //     System.out.println(integer);
        // }

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A","B","C","D"));
        ArrayList<String> toRemove = new ArrayList<>(Arrays.asList("A", "D"));
        list2.removeAll(toRemove);
        list2.removeIf(s -> s.equals("C"));  // Removes elements equal to "C"
         

        // The statement Object[] arr = list.toArray(); is used to convert an ArrayList (or any other collection) into an array of Object type
       Object[] arr = list.toArray();
       for (Object obj : arr) {
        System.out.println(obj); 
    }

    // Specific Type Array: If you want to convert the list to an array of a specific type (e.g., Integer[]), you should use the overloaded version of toArray():
    //This will give you an Integer[] array instead of an Object[].
       Integer[] arr1 = list.toArray(new Integer[0]);
       for (Integer integer : arr1) {
        System.out.print(integer+" ");
       }
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingArrayList {

    void create(){
        ArrayList<String> list1 = new ArrayList<>();// with initial capcity
        ArrayList<String> list2 = new ArrayList<>(20); // with specify capacity

        // creating Arraylist From another collection
        List<String> addList = Arrays.asList("Apple","Banana", "Orange");
        ArrayList<String> listFromColletion = new ArrayList<>(addList);
        // for (String string : listFromColletion) {
        //     System.out.print(string+" ");
        // }

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Pankaj","Shivam"));// Modifiable
        String[] arr = {"Sunday", "Monday","Tuesday"};
        List<String> addArray = Arrays.asList(arr);
        // for (String string : addArray) {
        //     System.out.print(string+" ");
        // }

        List<String> list4 = new ArrayList<>(addArray);
        list4.addAll(list3);
        for (String string : list4) {
            System.out.print(string+" ");
        }
    }
}
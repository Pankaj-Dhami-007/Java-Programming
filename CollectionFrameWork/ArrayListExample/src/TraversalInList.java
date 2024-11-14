import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class TraversalInList {
    public void traverse(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //System.out.println(list);

        Iterator<Integer> irt = list.iterator();
        while (irt.hasNext()) {
            Integer fruit = irt.next();
            System.out.println(fruit);
        }
    }
}

/*
The Iterator interface in Java is a part of the Java Collections Framework and sits at the root of the Iterator Hierarchy

 The Iterator interface in Java is a part of the java.util package and provides a way to traverse through elements in a collection, like List, Set, or Queue. It allows you to access each element of the collection without exposing its internal structure (like arrays or linked lists).

       Iterable<E>
          |
      Iterator<E>
          |
    ListIterator<E>
        |
    Spliterator<E>

 */

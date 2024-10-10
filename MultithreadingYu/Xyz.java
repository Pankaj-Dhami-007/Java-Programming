import java.util.*;

class Counter{
 private int count =0;
     public void increment(){
        count++;
     }
     public int getCount(){
        return count;
     }
} 

class Count extends Counter{
    private Counter counter;
    public Count(Counter counter){
        this.counter = counter;
    }
     public void count(){
        for(int i =0; i<1000; i++){
          counter.increment();
        }
     }  
}
public class Xyz {

        public static void main(String[] args) {
        Counter counter = new Counter();
        Count count = new Count(counter);
        count.count();
        System.out.println(counter.getCount());
   
    }
}

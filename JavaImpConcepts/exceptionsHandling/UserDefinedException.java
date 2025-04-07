
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class UserNotFoundException extends Exception{
    public UserNotFoundException(String msg){
        super(msg);
    }

}

public class UserDefinedException {
    public static void main(String[] args){
        List<String> users = Arrays.asList("Bob", "John", "Adam","Null");
        System.out.println(users.get(3));

        try {
            if (!users.contains("Alice")) {
                throw new UserNotFoundException("User 'Alice' not found!");
            } else {
                System.out.println("User Exists");
            }
        } catch (UserNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
       

        Iterator<String> iterator = users.iterator();
        while(iterator.hasNext()){
            String user = iterator.next();
            System.out.println(user);
        }

    }
}

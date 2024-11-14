import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerAndSupplier {
    public static void main(String[] args) {
        Consumer<Integer> print = x-> System.out.println(x); // only take
        print.accept(12);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> printList = x ->{
            for (Integer integer : list) {
                System.out.println(integer);
            }
        };
        printList.accept(list); 
        
        
        Supplier<String> sayHellow = ()-> "Hellow"; // only gives
        System.out.println(sayHellow.get());


        //unaryOperator and BinaryOperator

    }
}

/*
 1. UnaryOperator
A UnaryOperator<T> is a functional interface that extends Function<T, T>.
It represents an operation on a single operand that produces a result of the same type as the operand.
It's commonly used when you want to transform a value into another value of the same type (e.g., incrementing a number, changing the case of a string).
It takes one argument of type T and returns a result of the same type T.


2. BinaryOperator
A BinaryOperator<T> is a functional interface that extends BiFunction<T, T, T>.
It represents an operation upon two operands of the same type, producing a result of the same type as the operands.
It is used when both operands and the result are of the same type.
It takes two arguments of type T and returns a result of the same type T.
 */

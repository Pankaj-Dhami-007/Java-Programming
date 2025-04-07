class StreamBasics{
    
}

/*
 1.providing a more concise and readable way to process data.
 2.treams allow you to perform various operations on collections of objects (such as lists, sets, etc.) in a functional style


(A) Intermediate Operations: Operations that transform a stream into another stream (e.g., filter(), map(), sorted()).
(B) Terminal Operations: Operations that produce a result or a side-effect (e.g., collect(), forEach(), reduce()).

Common Intermediate Operations:
map(): Transforms each element.
filter(): Filters elements based on a condition.
sorted(): Sorts elements.
distinct(): Removes duplicates.


Common Terminal Operations:
forEach(): Applies an action to each element.
collect(): Collects the elements of the stream into a collection (e.g., List, Set).
reduce(): Reduces the stream to a single value.
count(): Counts the number of elements in the stream.
anyMatch(), allMatch(), noneMatch(): Perform a logical check on elements.


. Working with Primitive Streams:
Java provides special streams for primitive types, such as IntStream, DoubleStream, and LongStream. These are more efficient because they avoid boxing and unboxing operations that occur when using object streams.

. Parallel Streams:
Streams can be processed in parallel for better performance on multi-core systems. This is done using the parallelStream() method.

. Reduce Operation:
The reduce() operation is used to combine elements of a stream into a single result. It takes a binary operator (a function that takes two arguments and returns one result).

 */
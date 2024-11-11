import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 InputStreamReader is a class in Java that acts as a bridge between byte streams and character streams. It is part of the java.io package and is used to read bytes from an input stream and decode them into characters using a specified charset. This is particularly useful when you're dealing with data that needs to be read in text format, such as files or network connections.
 */

public class InputFromBufferReader {
    public static void main(String[] args) {
        // Create a BufferedReader to read from the console
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name:");
            String name = br.readLine(); // Read a line of text from the console
            System.out.println("Hello, " + name + "!");

            System.out.println("Enter your age:");
            String age = br.readLine(); // Read another line of text
            System.out.println("You are " + age + " years old.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}

/*
 InputStream: The source of the input data. In this case, it’s System.in, which represents standard input (typically the keyboard).
The InputStreamReader reads bytes from System.in and decodes them into characters using the platform's default character encoding (often UTF-8 or ISO-8859-1).


Creating the InputStreamReader:

new InputStreamReader(System.in) creates an InputStreamReader that reads byte data from the console and converts it into character data.
Wrapping with BufferedReader:

BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) wraps the InputStreamReader in a BufferedReader. This allows for efficient reading of lines of text.
Reading Input:

br.readLine() reads an entire line of text entered by the user. The method blocks until the user enters a line and presses Enter



Advantages of Using InputStreamReader:
Character Encoding: It allows for the specification of character encoding (if needed), enabling you to handle different types of text input.
Efficiency: When used with BufferedReader, it becomes more efficient for reading large inputs.
Flexibility: You can easily switch to reading from other byte streams (like files or network connections) by changing the InputStream used.
 */

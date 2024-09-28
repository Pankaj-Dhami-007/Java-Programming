// toCharArray() method in Java is a member of the String class. It converts a string into a character array. This can be useful when you want to manipulate individual characters of a string.

//The charAt(int index) method in Java is a member of the String class that returns the character at a specified index within the string. This method is useful for accessing individual characters when you need to analyze or manipulate them.
public class StringMethods {
    static void toCharArrayMethod(String str) {
        char charArray[] = str.toCharArray();
        System.out.println("Char Array: ");
        for (char c : charArray) {
            System.out.print(c + "  ");
        }
    }
    static void charAtMethod(String str){
        int stringLength = str.length();
        System.out.print("First character is: "+str.charAt(0));
    System.out.println();
        // Attempting to access an index out of bounds
        try {
            char invaliChar = str.charAt(stringLength);//this will throw an exception
        } catch (StringIndexOutOfBoundsException  e) {
            System.out.println("Error: "+ e.getMessage());
        }
        

    }

    public static void main(String[] args) {
        String var1 = "Hii , My name is Pankaj Singh Dhami";
        //toCharArrayMethod(var1);
        charAtMethod(var1);

    }
}

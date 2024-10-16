public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println("Try Block");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Catch block");
        } 
        finally{
            System.out.println("Finally block");
        }
        System.out.println("Outside try-catch-finally");
    }
}

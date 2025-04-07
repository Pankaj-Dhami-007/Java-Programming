// Step 1: Define Custom Exception
class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    // Step 2: Method to validate age
    public static void checkAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("Age must be 18 or above to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // Step 3: Exception will be thrown here
        } catch (AgeValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

package Day6_Class_Assignment;
import java.lang.Exception;
import java.util.Scanner;

class InvalidPinException extends Exception {
    public InvalidPinException(String msg) {
        super(msg);
    }
}

class ATM {
    private int correctPin = 3690;

    public void enterPin(int pin) throws InvalidPinException {
        if (pin != correctPin) {
            throw new InvalidPinException("Security Alert:Invalid PIN entered");
        } else {
            System.out.println("Welcome! Authentication Successful");
        }
    }
}

public class exception_usecase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        System.out.print("Please enter your PIN: ");
        int userPin = sc.nextInt();
        
        try {
            atm.enterPin(userPin);
        } catch (InvalidPinException e) {
            System.out.println("Access Denied: " + e.getMessage());
        } finally {
            System.out.println("System Log: Attempt recorded successfully");
        }

        sc.close();
    }
}

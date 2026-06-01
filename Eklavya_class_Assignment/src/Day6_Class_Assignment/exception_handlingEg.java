package Day6_Class_Assignment;
import java.util.Scanner;
public class exception_handlingEg {
	
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int correctPin = 3690;
	        System.out.print("Enter PIN: ");
	        int pin = s.nextInt();
	        try {
	            if (pin != correctPin) {
	                throw new Exception();
	            }
	            System.out.println("Login Success");
	        } catch (Exception e) {
	            System.out.println("Invalid PIN, Access Denied");
	        } finally {
	            System.out.println("Attempt Recorded");
	        }
	        s.close();
	    }
	}

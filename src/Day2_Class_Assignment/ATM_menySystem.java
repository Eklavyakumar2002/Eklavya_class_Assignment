package Day2_Class_Assignment;
import java.util.Scanner;
public class ATM_menySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int choice = 0;
        double balance = 1000;
        while (choice != 4) {
            System.out.println("View Balance");
            System.out.println(" Deposit");
            System.out.println(" Exit");
            System.out.print("Select: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println( balance);
            } else if (choice == 2) {
                System.out.print("Enter amount: ");
                balance += input.nextDouble();
            } else if (choice == 3) {
                System.out.println("Goodbye");
            } else {
                System.out.println("Try again.");
            }
        }
	}

}

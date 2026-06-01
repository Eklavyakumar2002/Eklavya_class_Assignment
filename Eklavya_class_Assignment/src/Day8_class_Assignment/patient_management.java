package Day8_class_Assignment;
import java.util.*;
public class patient_management{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    ArrayList<String> patients = new ArrayList<>();
	        while(true) {
	            System.out.println("\n1.Add Patient");
	            System.out.println("2.Add Emergency Patient");
	            System.out.println("3.Remove Patient");
	            System.out.println("4.View All Patients");
	            System.out.println("5.Search Patient");
	            System.out.println("6.Exit");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();

	            switch(choice) {
	                case 1:
	                    System.out.print("Enter patient name: ");
	                    String name = sc.nextLine();
	                    patients.add(name);
	                    System.out.println("Patient added");
	                    break;
	                case 2:
	                    System.out.print("Enter emergency patient name: ");
	                    String emergency = sc.nextLine();
	                    patients.add(0, emergency); 
	                    System.out.println("Emergency patient added at first");
	                    break;
	                case 3:
	                    if(patients.isEmpty()) {
	                        System.out.println("No patient to remove");
	                    } else {
	                        System.out.println("Removed: " + patients.remove(0));
	                    }
	                    break;
	                case 4:
	                    System.out.println("All Patients: " + patients);
	                    break;
	                case 5:
	                    System.out.print("Enter name to search: ");
	                    String search = sc.nextLine();
	                    if(patients.contains(search)) {
	                        System.out.println("Patient found");
	                    } else {
	                        System.out.println("Patient not found");
	                    }
	                    break;
	                case 6:
	                    System.out.println("Exiting...");
	                    return;

	                default:
	                    System.out.println("Invalid choice");
	            }
	        }
	    }
	}


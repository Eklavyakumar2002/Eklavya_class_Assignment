package Day2_Class_Assignment;
import java.util.Scanner;
public class Employee_salaryincrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int salary=22000;
//		for(int i=1;i<=3;i++) {
//			salary=salary+500;
//			System.out.println(salary);
//		}
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of employees:");
	        int n = sc.nextInt();
	        int salary[] = new int[n];
	        System.out.println("Enter salaries:");
	        for(int i = 0; i < n; i++) {
	            salary[i] = sc.nextInt();
	        }
	        System.out.print("Enter increment amount:");
	        int increment = sc.nextInt();
	        System.out.println("Updated Salaries:");
	        for(int i = 0; i < n; i++) {
	            int updated = salary[i] + increment;
	            System.out.println(updated);
	        }

	        sc.close();
	    }
	}


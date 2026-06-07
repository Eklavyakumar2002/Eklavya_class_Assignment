package Practiseforbest;
import java.util.*;
public class loan_eligibility {
	public static void main(String args[]) {
		System.out.println("enter age and salary");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int salary=sc.nextInt();
		if(age >=21 && salary>=30000) {
			System.out.println("eligible");
		}
		else {
			System.out.println("noteligible");
		}
	}
}

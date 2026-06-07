package Practiseforbest2;
import java.util.*;
public class grade_performance {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter grade to check performance");
		char grade=sc.next().charAt(0);
		if(grade=='A') {
			System.out.println("excellent:");
		}
		else if(grade=='B') {
			System.out.println("good");
		}
		else if(grade=='C') {
			System.out.println("average");
		}
		else if(grade=='F'){
			System.out.println("fail");
		}
		else {
			System.out.println("invalid:");
		}
	}
}

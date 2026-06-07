package Practiseforbest2;
import java.util.*;
public class even_oddswitch {
	public static void main(String args[]) {
		System.out.println("enter the nos");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=n%2;
		
		switch(rem) {
		case 0:
			System.out.println("even");
			break;
		case 1:
		case -1:	
			System.out.println("odd");
			break;
		default:
			System.out.println("invalid");
		}
		
	}
}

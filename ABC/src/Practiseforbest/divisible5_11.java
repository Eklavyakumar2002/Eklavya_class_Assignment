package Practiseforbest;
import java.util.*;
public class divisible5_11{
	public static void main(String args[]) {
		System.out.println("enter the no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%5==0 && n%11==0) {
			System.out.println("divisible");
		}
		else {
			System.out.println("notdivisible");
		}
		
	}
}
package Practiseforbest;
import java.util.*;
public class leap_year {
	public static void main(String args[]) {
		System.out.println("enter year");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n%4==0 && n%100!=0) || (n%400==0)){
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
	}
}

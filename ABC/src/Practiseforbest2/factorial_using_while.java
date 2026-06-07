package Practiseforbest2;
import java.util.*;
public class factorial_using_while {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int fact=1;
		while(i<=n) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}

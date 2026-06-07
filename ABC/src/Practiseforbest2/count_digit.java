package Practiseforbest2;
import java.util.*;
public class count_digit {
	
	public static void main(String args[]) {
		int cnt=0;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n!=0) {
			n=n/10;
			cnt++;
		}
		System.out.println(cnt);
	}
}

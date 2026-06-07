package Practiseforbest;
import java.util.*;
public class largestofthree {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first,secnod and third number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is largest" + " "+ a);
		}
		else if(b>a && b>c) {
			System.out.println("b is largest" + " " + b);
		}
		else {
			System.out.println("c is largest" + " " + c);
		}
	}
}

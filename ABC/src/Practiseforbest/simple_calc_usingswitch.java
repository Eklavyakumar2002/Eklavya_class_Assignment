package Practiseforbest;
import java.util.Scanner;
public class simple_calc_usingswitch {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("enter choice  + - * /");
		char choice=sc.next().charAt(0);
		switch(choice) {
		case '+':
			System.out.println("sum"+ (a+b));
			break;
		case '-':
			System.out.println("sum"+ (a-b));
			break;
		case '*':
			System.out.println("sum"+ (a*b) );
			break;
		case '/':
			System.out.println("sum"+ (a/b) );
			break;
		default:
			System.out.println("invalid choice");
		}
	}
}

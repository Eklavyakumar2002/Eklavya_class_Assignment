package Practiseforbest2;
import java.util.Scanner;
public class fibonacci_tilln {
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int firstno=0;
			int secondno=1;
			int i=1;
			if(n==0) return;
			System.out.println(firstno);
			System.out.println(secondno);
			while(i<=n) {
				int third_no=firstno+secondno;
				System.out.println(third_no);
				firstno=secondno;
				secondno=third_no;
				i++;
			}
			
		}
}
